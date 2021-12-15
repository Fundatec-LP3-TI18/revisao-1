package provaSOLID.impostos;

import provaSOLID.CalculoProdutoInterface;

public class IOF implements CalculoProdutoInterface {
    @Override
    public Double aplicarPromocao(Double valorProduto) {
        throw new RuntimeException("Não é uma promoção!");
    }

    @Override
    public Double aplicarImposto(Double valorProduto, Double porcentoTaxa) {
        return valorProduto + (valorProduto * porcentoTaxa);
    }
}
