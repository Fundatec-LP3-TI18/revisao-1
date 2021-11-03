package exercicios.ex_02_DIP.CalculosDeSalario;

public class SalarioDesenvolvedor {
    public double calcularSalarioDesenvolvedor(double valorFinal){
        if (valorFinal > 3000.0) {
            return valorFinal + (valorFinal * 0.2);
        } else {
            return valorFinal + (valorFinal * 0.1);
        }
    }
}
