package exercicios.boasPraticas;

import exercicios.boasPraticas.pessoas.Cliente;
import exercicios.boasPraticas.pessoas.Entregador;

public interface CalculoEntregaInterface {

    public Double processarEntrega(Entregador entregador, Cliente cliente, Pacote pacote);

}
