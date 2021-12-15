package provaSOLID.impostos;

import provaSOLID.CalculoProdutoInterface;

public class ICMS implements CalculoProdutoInterface {
    @Override
    public Double aplicarPromocao(Double valorProduto) {
        throw new RuntimeException("Não é uma promoção!");
    }

    @Override
    public Double aplicarImposto(Double valorProduto, Double porcentoTaxa) {
        return valorProduto + 20 + (valorProduto * porcentoTaxa);
    }
}
