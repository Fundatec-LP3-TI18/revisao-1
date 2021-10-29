import infrastructure.ProdutoRepositoryArray;
import infrastructure.ProdutoRepositoryInterface;
import infrastructure.ProdutoRepositoryMongoDB;
import infrastructure.ProdutoRepositoryMySql;
import model.Produto;
import service.VendaService;
import view.Tela;

public class Main {


    public static void main(String[] args) {

        // Tela (In)
        Tela tela = new Tela();
        Integer idTipoCliente = tela.escolhaDeTipoDeCliente();
        Integer idProduto = tela.escolhaDeProduto();

        // Produto
        ProdutoRepositoryInterface repositorioDeProduto = new ProdutoRepositoryMongoDB();
        Produto produto = repositorioDeProduto.buscarPeloId(idProduto);

        // Processo
        VendaService vendaService = new VendaService(produto, idTipoCliente);
        Double valorFinal = vendaService.vender();
        System.out.println(valorFinal);


    }
}
// oi, tudo bom guri?
// tudo, e contigo?
