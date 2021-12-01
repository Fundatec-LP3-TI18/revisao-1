package exercicios.boasPraticas.pessoas;

import exercicios.boasPraticas.HabilitacaoMoto;

public class Entregador {

    private String nome;
    private String email;
    private String telefone;

    private HabilitacaoMoto habilitacaoMoto;

    public Entregador(String nome, String email, HabilitacaoMoto habilitacaoMoto) {
        this.nome = nome;
        this.email = email;
        this.habilitacaoMoto = habilitacaoMoto;
    }

    public String getNome() {
        return nome;
    }

    public HabilitacaoMoto getHabilitacaoMoto() {
        return habilitacaoMoto;
    }
}
