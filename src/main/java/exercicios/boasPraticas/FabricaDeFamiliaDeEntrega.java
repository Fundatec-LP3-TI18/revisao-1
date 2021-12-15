package exercicios.boasPraticas;

import exercicios.boasPraticas.pessoas.Entregador;
import exercicios.boasPraticas.tiposEntregas.EntregaDeBicicleta;
import exercicios.boasPraticas.tiposEntregas.EntregaDeMoto;

public class FabricaDeFamiliaDeEntrega {
    public static CalculoEntregaInterface criarCalculoDeEntrega(Entregador entregador) {

        if(entregador.tuEntregaDeMoto())
            return new EntregaDeMoto();

        return new EntregaDeBicicleta();

    }
}
