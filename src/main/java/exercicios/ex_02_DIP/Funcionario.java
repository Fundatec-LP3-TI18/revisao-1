package exercicios.ex_02_DIP;

public class Funcionario {
    private final exercicios.ex_01_SRP.CARGO desenvolvedor;
    private final Double salario;
    private CARGO cargo;
    private Double salarioBase;

    public Funcionario(exercicios.ex_01_SRP.CARGO desenvolvedor, Double salario) {
        this.desenvolvedor = desenvolvedor;
        this.salario = salario;
    }

    public CARGO getCargo() {
        return cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }
}
