package exercicios.boasPraticas.tiposEntregas;

import exercicios.boasPraticas.Pacote;
import exercicios.boasPraticas.pessoas.Cliente;
import exercicios.boasPraticas.pessoas.Entregador;

public class EntregaDeBicicleta {
    public Double entregar(Entregador entregador, Cliente cliente, Pacote pacote) {

        System.out.println("Entregador: " + entregador.getNome());
        System.out.println("Entregando o pacote: " + pacote.getDescricao());
        System.out.println("Pronto! Entregue para: " + cliente.getNome());

        return 20d;
    }
}
