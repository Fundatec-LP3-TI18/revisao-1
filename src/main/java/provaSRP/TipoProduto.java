package provaSRP;

public enum TipoProduto {
    SERVICOS(1L), COMIDA(2L), ELETRONICOS(3L), IMPORTADO(1000L);

    private long id;

    TipoProduto(long id) {
        this.id = id;
    }
}
