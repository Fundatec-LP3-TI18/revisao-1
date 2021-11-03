package exercicios.ex_02_DIP;

import exercicios.ex_02_DIP.CalculosDeSalario.SalarioCargoMil;
import exercicios.ex_02_DIP.CalculosDeSalario.SalarioDbaeTester;
import exercicios.ex_02_DIP.CalculosDeSalario.SalarioDesenvolvedor;

import static exercicios.ex_01_SRP.CARGO.*;

/* Esta classe:
    Recebe uma classe funcionário, que tem um cargo e um salário base.
    Retorna o salário líquido do funcionário
*/

class CalculadoraDeSalario {
    public double calcula(Funcionario funcionario) {
        if (DESENVOLVEDOR.equals(funcionario.getCargo()))
            return new SalarioDesenvolvedor().calcularSalarioDesenvolvedor(funcionario.getSalarioBase());

        if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo()))
            return new SalarioDbaeTester().calcularSalariodbaeTester(funcionario.getSalarioBase());


        if (CARGO_NUMERO_MIL.equals(funcionario.getCargo()))
            return new SalarioCargoMil().calcularSalarioCargoMil(funcionario.getSalarioBase());

        throw new RuntimeException("Cargo inválido");
    }
}

