package exercicios.boasPraticas;

import exercicios.boasPraticas.pessoas.Cliente;
import exercicios.boasPraticas.pessoas.Entregador;
import exercicios.boasPraticas.tiposEntregas.EntregaDeBicicleta;

public class EntregaService {

    private CalculoEntregaInterface familiaEntrega;
    private final Entregador entregador;
    private final Cliente cliente;
    private final Pacote pacote;

    public EntregaService(CalculoEntregaInterface familiaEntrega, Entregador entregador, Cliente cliente, Pacote pacote) {
        this.familiaEntrega = familiaEntrega;
        this.entregador = entregador;
        this.cliente = cliente;
        this.pacote = pacote;
    }

    public Double calcularTempoDeEntrega() {
        return familiaEntrega.processarEntrega(entregador, cliente, pacote);
    }

}
