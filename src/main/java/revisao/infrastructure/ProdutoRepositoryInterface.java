package revisao.infrastructure;

import revisao.model.Produto;

public interface ProdutoRepositoryInterface {

    public Produto buscarPeloId(Integer idDoProduto);
}
