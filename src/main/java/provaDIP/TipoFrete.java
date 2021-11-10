package provaDIP;

public enum TipoFrete {
    CORREIOS(1L), FEDEX(2L), TERCEIRIZADO(3L), CHINA(1000L);

    private long id;

    TipoFrete(long id) {
        this.id = id;
    }
}
