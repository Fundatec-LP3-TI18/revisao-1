package revisao.model;

public class FabricaPromocao {

    public static PromocaoInterface criarPromocao(Integer idCliente){
        if(idCliente == 1) {
            return new PromocaoPessoaFisica();
        } else if (idCliente == 2) {
            return new PromocaoPessoaJuridica();
        } else {
            return new PromocaoFuncionario();
        }
    }
}
