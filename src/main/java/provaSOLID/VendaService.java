package provaSOLID;

public class VendaService {

    private CalculoProdutoInterface calculoProdutoPromocao;
    private CalculoProdutoInterface calculoProdutoImposto;

    public VendaService(CalculoProdutoInterface calculoProdutoPromocao, CalculoProdutoInterface calculoProdutoImposto) {
        this.calculoProdutoPromocao = calculoProdutoPromocao;
        this.calculoProdutoImposto = calculoProdutoImposto;
    }

    public Double vender(Double valorProduto, Double taxaImposto) {

        valorProduto = calculoProdutoPromocao.aplicarPromocao(valorProduto);
        valorProduto = calculoProdutoImposto.aplicarImposto(valorProduto, taxaImposto);

        return valorProduto;
    }
}
