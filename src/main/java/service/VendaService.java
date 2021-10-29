package service;

import model.Produto;
import model.PromocaoFuncionario;
import model.PromocaoPessoaFisica;
import model.PromocaoPessoaJuridica;

public class VendaService {

    private Produto produto;
    private int tipoClienteId;

    public VendaService(Produto produto, int tipoClienteId) {
        this.produto = produto;
        this.tipoClienteId = tipoClienteId;
    }

    // SRP 1 - Identificar responsabilidades
        // Se formos reutilizar o calculo da prom PF
        // Se formos reutilizar o calculo da prom PJ
        // Manutenção 0

    // SRP 2 - Dividir as responsabilidades em CLASSES separadas

    // 1 - Escolhendo a promocao (Continua)
    // 2 - Delegando classes a calcularem promocoes
    public Double vender() {
        Double valorFinal = produto.getValor();


        // + coesao (SRP)
        // juntos
        // + acoplamentos (Pior DIP)
        if(this.tipoClienteId == 1) {
            valorFinal -= new PromocaoPessoaFisica().calcularPromocaoPessoaFisica(valorFinal);
        } else if (this.tipoClienteId == 2) {
            valorFinal -= new PromocaoPessoaJuridica().calcularPromocaoPessoaJuridica(valorFinal);
        } else if (this.tipoClienteId == 3) {
            valorFinal = new PromocaoFuncionario().calcularPromocaoFuncionario(valorFinal);
        } else if (this.tipoClienteId == 4) {
            valorFinal = new PromocaoFuncionario().calcularPromocaoFuncionario(valorFinal);
        }

        return valorFinal;
    }
}
