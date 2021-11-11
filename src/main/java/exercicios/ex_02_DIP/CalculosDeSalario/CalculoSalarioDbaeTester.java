package exercicios.ex_02_DIP.CalculosDeSalario;

public class CalculoSalarioDbaeTester implements CalculosDeSalario {

    public double calcular(double valorFinal){
       return valorFinal + (valorFinal * 0.3);
    }
}
