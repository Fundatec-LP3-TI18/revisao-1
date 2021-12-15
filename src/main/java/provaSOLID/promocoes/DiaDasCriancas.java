package provaSOLID.promocoes;

import provaSOLID.CalculoProdutoInterface;

public class DiaDasCriancas implements CalculoProdutoInterface {
    @Override
    public Double aplicarPromocao(Double valorProduto) {
        return valorProduto - (valorProduto * 0.10);
    }

    @Override
    public Double aplicarImposto(Double valorProduto, Double porcentoTaxa) {
        throw new RuntimeException("Não é um imposto!");
    }
}
