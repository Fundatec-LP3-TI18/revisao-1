package provaDIP;

public class NotificacaoDeEmail implements NotificacaoInterface {

    public void enviar(Double valorProduto) {
        System.out.println("=== ENVIANDO EMAIL ===");
        System.out.println("O valor total foi de: " + valorProduto);
    }
}
