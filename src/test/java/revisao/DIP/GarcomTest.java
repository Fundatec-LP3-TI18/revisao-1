package revisao.DIP;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import revisao.DIP.FormasDeServir.ServirCerveja;
import revisao.DIP.FormasDeServir.ServirVodka;

import static org.junit.jupiter.api.Assertions.*;

class GarcomTest {


    @Test
    public void deveChamarServirVodkaQuandoForUm(){
        // Given
        Garcom garcom = new Garcom();

        ServirVodka servirVodka = Mockito.mock(ServirVodka.class);
        Mockito.when(servirVodka.servir()).thenReturn("lalala");

        ServirCerveja servirCerveja = new ServirCerveja();

        String texto = garcom.servirBebidaSemAbstracao(1, servirVodka, servirCerveja);

        Mockito.verify(servirVodka).servir();
    }

    @Test
    public void deveServirCervejaQuandoForDois(){
        // Given
        Garcom garcom = new Garcom();
        ServirVodka servirVodka = new ServirVodka();
        ServirCerveja servirCerveja = new ServirCerveja();

        String texto = garcom.servirBebidaSemAbstracao(2, servirVodka, servirCerveja);

        assertEquals("Estou servindo Cerveja!!!!", texto);
    }



    @Test
    public void classeRealDoSistemENAOUmTeste(){
        // Given
        Garcom garcom = new Garcom();

        // Cliente fazer o pedido
        ServirVodka modoDeServir = new ServirVodka();
//        ServirCerveja modoDeServir = new ServirCerveja();
//        ServirAbsinto servirAbsinto = new ServirAbsinto();

        String texto = garcom.servirBebidaComAbstracao(2, modoDeServir);

        assertEquals(1, 1);
    }


}