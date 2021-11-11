package exercicios.ex_02_DIP.CalculosDeSalario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoSalarioCargoMilTest {

    @Test
    public void deveRetornarOValorDoSalarioMais100QuandoReceberUmSalario(){
        CalculoSalarioCargoMil calculoSalarioCargoMil = new CalculoSalarioCargoMil();
        double salario = 100;

        double resultado = calculoSalarioCargoMil.calcular(salario);

        assertEquals(200, resultado);
    }

}