package infrastructure;

import model.Produto;

public interface ProdutoRepositoryInterface {

    public Produto buscarPeloId(Integer idDoProduto);
}
