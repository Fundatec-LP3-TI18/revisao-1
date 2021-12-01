package revisao.service;

import exemplos.solid.dip.*;
import exemplos.solid.dip.VendaService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class VendaServiceTest {


    @Test
    public void deveChamarOEnvioDeUmEmail(){
        Produto camisa = new Produto(100f, "Camisa");

        PromocaoInterface promocao = Mockito.mock(PromocaoInterface.class);

        VendaService vendaService = new VendaService(camisa, promocao);
        Mockito.verify(promocao.calcula(camisa.getValor()));
    }

    @Test
    public void deveChamarUmaPromocao(){
        Produto camisa = new Produto(100f, "Camisa");

        PromocaoInterface promocao = Mockito.mock(PromocaoInterface.class);

        VendaService vendaService = new VendaService(camisa, promocao);
        Mockito.verify(promocao.calcula(camisa.getValor()));
    }

    @Test
    public void deveSomarMaisDoisAoRetornoDeUmaPromocao(){
        Produto camisa = new Produto(100f, "Camisa");

        PromocaoInterface promocao = Mockito.mock(PromocaoInterface.class);
        Mockito.when(promocao.calcula(camisa.getValor())).thenReturn(100f);

        VendaService vendaService = new VendaService(camisa, promocao);
        Float resultado = vendaService.vender();

//        assertEquals(resultado, 1f);
    }

}