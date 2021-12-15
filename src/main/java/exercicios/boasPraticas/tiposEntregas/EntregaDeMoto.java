package exercicios.boasPraticas.tiposEntregas;

import exercicios.boasPraticas.CalculoEntregaInterface;
import exercicios.boasPraticas.Pacote;
import exercicios.boasPraticas.pessoas.Cliente;
import exercicios.boasPraticas.pessoas.Entregador;

public class EntregaDeMoto implements CalculoEntregaInterface {
    public Double processarEntrega(Entregador entregador, Cliente cliente, Pacote pacote) {
        if(pacote.tuEhValidoParaMoto()) { // quem quebrava antes?
            System.out.println("Entregador: " + entregador.getNome());
            System.out.println("Pronto! Entregue rapidinho de moto!");
            return 10d;
        } else {
            throw new RuntimeException("O pacote não cabe no baú da moto!!!");
        }
    }
}
