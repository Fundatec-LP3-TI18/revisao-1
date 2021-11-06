package provaSRP;

import static org.junit.jupiter.api.Assertions.*;
import static provaSRP.TipoProduto.SERVICOS;

class ImpostoDeServicosTest {

    @org.junit.jupiter.api.Test
    void deveRetornarOValorTotalVezesUmPontoTresQuandoOTipoDeProdutoForServico(){
        ImpostoDeServicos impostoDeServicos = new ImpostoDeServicos();

        double retorno = impostoDeServicos.calcula(10f);

        assertEquals(13, retorno);
    }
}