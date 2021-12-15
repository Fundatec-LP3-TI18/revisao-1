package provaDIP;

public class NotificacaoDeSMS implements NotificacaoInterface {

    public void enviar(Double valorProduto) {
        System.out.println("=== ENVIANDO SMS ===");
        System.out.println("O valor total foi de: " + valorProduto);
    }

}
