package infrastructure;

import model.Produto;

import java.util.ArrayList;
import java.util.Optional;

public class ProdutoRepositoryMySql implements ProdutoRepositoryInterface {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Produto buscarPeloId(Integer idDoProduto) {
         // return jpaRepository.findById()

        return new Produto(1, "Camisa", 100d);
    }
}
