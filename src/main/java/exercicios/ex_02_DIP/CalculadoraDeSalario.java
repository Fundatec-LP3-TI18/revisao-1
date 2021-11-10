package exercicios.ex_02_DIP;

import exercicios.ex_02_DIP.CalculosDeSalario.CalculoSalarioCargoMil;
import exercicios.ex_02_DIP.CalculosDeSalario.CalculoSalarioDbaeTester;
import exercicios.ex_02_DIP.CalculosDeSalario.CalculoSalarioDesenvolvedor;

import static exercicios.ex_01_SRP.CARGO.*;

class CalculadoraDeSalario {
    public double calcula(Funcionario funcionario) {
        if (DESENVOLVEDOR.equals(funcionario.getCargo()))
            return new CalculoSalarioDesenvolvedor().calcularSalarioDesenvolvedor(funcionario.getSalarioBase());

        if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo()))
            return new CalculoSalarioDbaeTester().calcularSalariodbaeTester(funcionario.getSalarioBase());

        if (CARGO_NUMERO_MIL.equals(funcionario.getCargo()))
            return new CalculoSalarioCargoMil().calcularSalarioCargoMil(funcionario.getSalarioBase());

        throw new RuntimeException("Cargo inválido");
    }
}

