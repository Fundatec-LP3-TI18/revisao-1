package revisao.model;

public class PromocaoPessoaJuridica implements PromocaoInterface {

    public Double calculaPromocao(Double valorFinal) {
        return valorFinal * 0.20;
    }
}
