package exercicios.ex_01_SRP;

import static exercicios.ex_01_SRP.CARGO.*;

/* Esta classe:
    Recebe uma classe funcionário, que tem um cargo e um salário base.
    Retorna o salário líquido do funcionário
*/

// 1 - Calcular salario de desenvolvedor
// 2 - Calcular salario de DBA e TESTER
// 3 - Calcular salario cargo mil

class CalculadoraDeSalario {
    public double calcula(Funcionario funcionario) {

        if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return dezOuVintePorcento(funcionario);
        }

        if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
            return trintaPorcento(funcionario);
        }

        if (CARGO_NUMERO_MIL.equals(funcionario.getCargo())) {
            // Fiz esse cálculo para o Cargo Mil,
            // ela retorna o salario mais uma comissao de 100 reais
            // (cuidado para nao criarem um bug, a regra é importante para a empresa)
            return funcionario.getSalarioBase() + 100;
        }

        throw new RuntimeException("Cargo inválido");
    }

    private double salarioMaisComissaoDe100Reais(Funcionario funcionario) {
        return funcionario.getSalarioBase() + 100;
    }

    private double dezOuVintePorcento(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        } else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }

    private double trintaPorcento(Funcionario funcionario) {
        return funcionario.getSalarioBase() * 0.70;
    }
}

