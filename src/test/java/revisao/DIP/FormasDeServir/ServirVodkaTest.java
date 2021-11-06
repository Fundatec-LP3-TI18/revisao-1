package revisao.DIP.FormasDeServir;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServirVodkaTest {

    @Test
    public void deveRetornarOTextoVodkaQuandoReceberIdForUm(){
        // Given
        ServirVodka servirVodka = new ServirVodka();

        // When
        String textoRetornado = servirVodka.servir();

        // Then
        assertEquals("Estou servindo Vodka!!!!", textoRetornado);
    }

}