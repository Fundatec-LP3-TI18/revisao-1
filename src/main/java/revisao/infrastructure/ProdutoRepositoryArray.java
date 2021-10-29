package revisao.infrastructure;

import revisao.model.Produto;

import java.util.ArrayList;
import java.util.Optional;

public class ProdutoRepositoryArray implements ProdutoRepositoryInterface{

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public ProdutoRepositoryArray() {
        // id, nome, preço, quantidade
        Produto camisa = new Produto(1, "Camisa", 100d);
        Produto bermuda = new Produto(2, "Bermuda", 50d);
        Produto meia = new Produto(3, "Meia", 20d);

        produtos.add(camisa);
        produtos.add(bermuda);
        produtos.add(meia);
    }
    public Produto buscarPeloId(Integer idDoProduto) {
        if(idDoProduto == null)
            throw new RuntimeException("A busca nao aceita nulo!");

        Optional<Produto> produto = produtos.stream()
                .filter(prod -> prod.getId() == idDoProduto).findFirst();

        return produto.get();
    }
}
