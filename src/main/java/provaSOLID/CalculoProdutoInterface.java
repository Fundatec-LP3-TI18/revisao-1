package provaSOLID;

public interface CalculoProdutoInterface {
    public Double aplicarPromocao(Double valorProduto);
    public Double aplicarImposto(Double valorProduto, Double porcentoTaxa);
}
