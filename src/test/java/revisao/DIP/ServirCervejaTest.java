package revisao.DIP;

import org.junit.jupiter.api.Test;
import revisao.DIP.FormasDeServir.ServirCerveja;

import static org.junit.jupiter.api.Assertions.*;

class ServirCervejaTest {

    @Test
    public void deveRetornarOTextoCervejaQuandoReceberIdforDois(){
        // Given
        ServirCerveja servirCerveja = new ServirCerveja();

        // When
        String textoRetornado = servirCerveja.servir();

        // Then
        assertEquals("Estou servindo Cerveja!!!!", textoRetornado);
    }

}