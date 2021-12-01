package exercicios.ex_02_DIP;

import exercicios.ex_01_SRP.CARGO;
import exercicios.ex_02_DIP.CalculosDeSalario.CalculoSalarioDesenvolvedor;
import exercicios.ex_02_DIP.CalculosDeSalario.CalculosDeSalario;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeSalarioTest {

    @Test
    public void deveRetornarOResultadoDeUmCalculoDaFamiliaDeCalculosDeSalarioEChamarUmCalculoDaFamiliaDeCalculos(){
        // Given
        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

        // When
        CalculosDeSalario familiaFake = Mockito.mock(CalculosDeSalario.class);
        Mockito.when(familiaFake.calcular(200d)).thenReturn(555d);
//        double resultado = calculadoraDeSalario.calcula(200d, familiaFake);

//        Mockito.verify(familiaFake).calcular(200d);
//        assertEquals(555d, resultado);
    }

}