package provaDIP;

import java.util.ArrayList;
import java.util.List;

public class FabricaDeListaDeNotificacao {
    public static List<NotificacaoInterface> criarLista() {

        List<NotificacaoInterface> listaDeNotificacao = new ArrayList<>();
        listaDeNotificacao.add(new NotificacaoDeEmail());
        listaDeNotificacao.add(new NotificacaoDeSMS());

        return listaDeNotificacao;
    }
}
