package revisao.model;

public class PromocaoFuncionario {

    public Double calcularPromocaoFuncionario(Double valorFinal) {
        valorFinal = valorFinal - 10d;
        valorFinal *= 10;
        valorFinal *= 10;
        valorFinal *= 10;
        return valorFinal;
    }
}
