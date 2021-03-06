package exercicios.boasPraticas;

public class Pacote {

    private String descricao;
    private Double peso;
    private Double metrosCubicos;

    public Pacote(String descricao, Double peso, Double metrosCubicos) {
        this.descricao = descricao;
        this.peso = peso;
        this.metrosCubicos = metrosCubicos;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getMetrosCubicos() {
        return metrosCubicos;
    }

    public boolean tuEhValidoParaMoto() {
        return getMetrosCubicos() < 30d;
    }

    public boolean tuEhValidoParaBicicleta() {
        return getPeso() < 100 && getMetrosCubicos() < 50d;
    }
}
