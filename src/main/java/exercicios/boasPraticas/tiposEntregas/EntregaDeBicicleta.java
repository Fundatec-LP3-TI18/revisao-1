package exercicios.boasPraticas.tiposEntregas;

import exercicios.boasPraticas.CalculoEntregaInterface;
import exercicios.boasPraticas.Pacote;
import exercicios.boasPraticas.pessoas.Cliente;
import exercicios.boasPraticas.pessoas.Entregador;

public class EntregaDeBicicleta implements CalculoEntregaInterface {

    public Double processarEntrega(Entregador entregador, Cliente cliente, Pacote pacote) {
        if(pacote.tuEhValidoParaBicicleta() && entregador.tuEhValidoParaBicicleta()) {
            System.out.println("Entregador: " + entregador.getNome());
            System.out.println("Entregando o pacote: " + pacote.getDescricao());
            System.out.println("Pronto! Entregue para: " + cliente.getNome());

            return 20d;
        } else {
            throw new RuntimeException("Não dá pra carregar isso na bicicleta! Muito pesado!");
        }
    }


}
