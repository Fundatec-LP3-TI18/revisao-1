package provaDIP.calculosFrete;

public class CalculoFreteChina {

    public Double calcular(Double valorOriginal){
        if(valorOriginal > 50) {
            return valorOriginal + 100;
        }

        return valorOriginal + 30;
    }
}
