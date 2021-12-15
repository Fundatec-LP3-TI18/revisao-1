package provaSOLID;

import provaSOLID.impostos.ICMS;
import provaSOLID.promocoes.BlackFriday;

public class Entrada {

    public static void main(String[] args) {
        CalculoProdutoInterface promocaoBlackFriday = new BlackFriday();
        CalculoProdutoInterface impostoICMS = new ICMS();

        VendaService vendaService = new VendaService(impostoICMS, promocaoBlackFriday);

        Double resultado = vendaService.vender(100d, 10d);
        System.out.println("Resultado final: " + resultado);
    }
}
