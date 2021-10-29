package revisao.infrastructure;

import revisao.model.Produto;

import java.util.ArrayList;

public class ProdutoRepositoryMongoDB implements ProdutoRepositoryInterface {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Produto buscarPeloId(Integer idDoProduto) {
        // Implementação do MongoDB

        return new Produto(1, "Camisa", 100d);
    }
}
