package revisao.model;

public class PromocaoFuncionario implements PromocaoInterface {

    @Override
    public Double calculaPromocao(Double valor) {
        valor = valor - 10d;
        valor *= 10;
        valor *= 10;
        valor *= 10;
        return valor;
    }
}
