package exercicios.boasPraticas;

import exercicios.boasPraticas.pessoas.Cliente;
import exercicios.boasPraticas.pessoas.Entregador;
import exercicios.boasPraticas.tiposEntregas.EntregaDeBicicleta;

public class EntregaService {

    private final EntregaDeBicicleta tipoEntrega;
    private final Entregador entregador;
    private final Cliente cliente;
    private final Pacote pacote;

    public EntregaService(EntregaDeBicicleta tipoEntrega, Entregador entregador, Cliente cliente, Pacote pacote) {
        this.tipoEntrega = tipoEntrega;
        this.entregador = entregador;
        this.cliente = cliente;
        this.pacote = pacote;
    }

    public Double calcularTempoDeEntrega() {
        if(entregador.getHabilitacaoMoto().getValida()) {
            if(pacote.getMetrosCubicos() < 30d) {
                System.out.println("Entregador: " + entregador.getNome());
                System.out.println("Pronto! Entregue rapidinho de moto!");
                return 10d;
            } else {
                throw new RuntimeException("O pacote não cabe no baú da moto!!!");
            }
        }

        if(pacote.getPeso() < 100) {
            return tipoEntrega.entregar(entregador, cliente, pacote);
        } else {
            throw new RuntimeException("Não dá pra carregar isso na bicicleta! Muito pesado!");
        }
    }
}
