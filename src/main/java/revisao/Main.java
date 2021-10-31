package revisao;

import revisao.infrastructure.ProdutoRepositoryInterface;
import revisao.infrastructure.ProdutoRepositoryMongoDB;
import revisao.model.*;
import revisao.service.VendaService;
import revisao.view.Tela;

public class Main {

    public static void main(String[] args) {
        // Tela (In)
        Tela tela = new Tela();
        Integer idTipoCliente = tela.escolhaDeTipoDeCliente();
        Integer idProduto = tela.escolhaDeProduto();

        // Produto
        ProdutoRepositoryInterface repositorioDeProduto = new ProdutoRepositoryMongoDB();
        Produto produto = repositorioDeProduto.buscarPeloId(idProduto);

        // Fabrica
        PromocaoInterface promocao = FabricaPromocao.criarPromocao(idTipoCliente);
        ImpostoInterface imposto = FabricaImposto.criarImposto(idProduto);

        VendaService vendaService = new VendaService(produto, promocao, imposto);
        Double valorFinal = vendaService.vender();
        System.out.println(valorFinal);
    }
}
// oi, tudo bom guri?
// tudo, e contigo?
