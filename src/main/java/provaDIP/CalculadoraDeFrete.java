package provaDIP;

import provaDIP.calculosFrete.CalculoFreteChina;
import provaDIP.calculosFrete.CalculoFreteCorreios;
import provaDIP.calculosFrete.CalculoFreteFedex;
import provaDIP.calculosFrete.CalculoFreteInterface;

import java.util.ArrayList;
import java.util.List;

import static provaDIP.TipoFrete.*;

public class CalculadoraDeFrete {

    // Subscribers -> Notificacoes
    // Publishers -> CalculadoraDeFrete
    public Double calculaComFamilia(Double valorProduto, CalculoFreteInterface familiaCalculo, List<NotificacaoInterface> listaDeNotificacao) {

        valorProduto = familiaCalculo.calcular(valorProduto);
        notificarFimDeCalculo(valorProduto, listaDeNotificacao);

        return valorProduto;
    }

    private void notificarFimDeCalculo(Double valorProduto, List<NotificacaoInterface> listaDeNotificacao) {
        for (NotificacaoInterface notificacao : listaDeNotificacao){
            notificacao.enviar(valorProduto);
        }
    }

}

