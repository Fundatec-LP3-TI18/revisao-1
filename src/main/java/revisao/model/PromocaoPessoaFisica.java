package revisao.model;

public class PromocaoPessoaFisica implements PromocaoInterface{

    public Double calculaPromocao(Double valorFinal) {
        return valorFinal - (valorFinal * 0.10);
    }

}
