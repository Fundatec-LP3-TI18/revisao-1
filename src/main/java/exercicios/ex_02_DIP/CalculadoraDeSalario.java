package exercicios.ex_02_DIP;

import exercicios.ex_02_DIP.CalculosDeSalario.CalculoSalarioCargoMil;
import exercicios.ex_02_DIP.CalculosDeSalario.CalculoSalarioDbaeTester;
import exercicios.ex_02_DIP.CalculosDeSalario.CalculoSalarioDesenvolvedor;
import exercicios.ex_02_DIP.CalculosDeSalario.CalculosDeSalario;

import static exercicios.ex_01_SRP.CARGO.*;

class CalculadoraDeSalario {
    public double calcula(
        Funcionario funcionario,
        CalculoSalarioDesenvolvedor calculoSalarioDesenvolvedor,
        CalculosDeSalario calculosDeSalario
    ) {
        if (DESENVOLVEDOR.equals(funcionario.getCargo())){
            calculosDeSalario = calculoSalarioDesenvolvedor;
            return calculosDeSalario.calcular(funcionario.getSalarioBase());
        }

        if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
            calculosDeSalario = new CalculoSalarioDbaeTester();
            return calculosDeSalario.calcular(funcionario.getSalarioBase());
        }

        if (CARGO_NUMERO_MIL.equals(funcionario.getCargo())) {
            calculosDeSalario = new CalculoSalarioCargoMil();
            return calculosDeSalario.calcular(funcionario.getSalarioBase());
        }

        if (CARGO_NUMERO_MIL.equals(funcionario.getCargo())) {
            calculosDeSalario = new CalculoSalarioCargoMil();
            return calculosDeSalario.calcular(funcionario.getSalarioBase());
        }

        throw new RuntimeException("Cargo inválido");
    }

}

