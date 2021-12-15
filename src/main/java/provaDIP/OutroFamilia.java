package provaDIP;

import provaDIP.calculosFrete.CalculoFreteChina;
import provaDIP.calculosFrete.CalculoFreteCorreios;

public interface OutroFamilia {

    public Double calcula(Double valorProduto, TipoFrete tipoFrete, CalculoFreteCorreios correios, CalculoFreteChina calculoFreteChina);

}
