package revisao.view;

import java.util.Scanner;

public class Tela {

    Scanner teclado;

    public Tela() {
        this.teclado = new Scanner(System.in);
    }

    public Integer escolhaDeTipoDeCliente() {
        System.out.println("Escolha seu tipo de Cliente \n 1 - Pessoa Fisica \n 2 - Pessoa juridica ");
        return teclado.nextInt();
    }

    public Integer escolhaDeProduto() {
        System.out.println("Escolha seu tipo de Produto \n 1 - Camisa R$: 10,00 \n 2 - Bermuda R$: 50,00 \n 3 - Meias R$: 20,00 ");
        return teclado.nextInt();
    }

}
