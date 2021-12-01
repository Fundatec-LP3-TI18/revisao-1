package provaDIP;

import provaDIP.calculosFrete.CalculoFreteChina;
import provaDIP.calculosFrete.CalculoFreteCorreios;

import static provaDIP.TipoFrete.*;

public class CalculadoraDeFrete {

    public Double calcula(Double valorProduto, TipoFrete tipoFrete, CalculoFreteCorreios correios, CalculoFreteChina calculoFreteChina) {

        if (FEDEX.equals(tipoFrete)) {
            valorProduto = valorProduto + 20;
        } else if (CORREIOS.equals(tipoFrete)) {
            valorProduto = correios.calcular(valorProduto);
        } else if (CHINA.equals(tipoFrete)) {
            valorProduto = calculoFreteChina.calcular(valorProduto);
        }

        System.out.println("=== ENVIANDO EMAIL ===");
        System.out.println("O valor total foi de: " + valorProduto);

        System.out.println("=== ENVIANDO SMS ===");
        System.out.println("O valor total foi de: " + valorProduto);

        return valorProduto;
    }
}

