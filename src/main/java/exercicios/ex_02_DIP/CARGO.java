package exercicios.ex_02_DIP;

public enum CARGO {
    DESENVOLVEDOR(1L), DBA(2L), TESTER(3L), CARGO_NUMERO_MIL(1000L);

    private long id;

    CARGO(long id) {
        this.id = id;
    }
}
