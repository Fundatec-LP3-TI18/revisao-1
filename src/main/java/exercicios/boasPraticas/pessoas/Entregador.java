package exercicios.boasPraticas.pessoas;

import exercicios.boasPraticas.HabilitacaoMoto;

public class Entregador {

    private String nome;
    private String email;
    private String telefone;

    public HabilitacaoMoto habilitacaoMoto;

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

    public boolean tuEntregaDeMoto() {
        return habilitacaoMoto.tuEhValida();
    }

    public boolean tuEhValidoParaBicicleta() {
        return "Sabino".equals(getNome());
    }
}
