package provaDIP;

import provaDIP.calculosFrete.CalculoFreteChina;
import provaDIP.calculosFrete.CalculoFreteCorreios;
import provaDIP.calculosFrete.CalculoFreteFedex;
import provaDIP.calculosFrete.CalculoFreteInterface;

import static provaDIP.TipoFrete.*;

public class FabricaDeCalculoFrete {


    public static CalculoFreteInterface escolherCalculo(TipoFrete tipoFrete) {

        CalculoFreteInterface calculoEscolhido;

        if (FEDEX.equals(tipoFrete)) {
            calculoEscolhido = new CalculoFreteFedex();
        } else if (CORREIOS.equals(tipoFrete)) {
            calculoEscolhido = new CalculoFreteCorreios();
        } else if (CHINA.equals(tipoFrete)) {
            calculoEscolhido = new CalculoFreteChina();
        } else calculoEscolhido = new CalculoFreteFedex();

        return calculoEscolhido;
    }
}
