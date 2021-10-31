package revisao.service;

import revisao.model.*;

public class VendaService {

    private Produto produto;
    private PromocaoInterface promocaoInterface;
    private ImpostoInterface impostoInterface;

    public VendaService(Produto produto,
                        PromocaoInterface promocaoInterface,
                        ImpostoInterface impostoInterface) {
        this.produto = produto;
        this.promocaoInterface = promocaoInterface;
        this.impostoInterface = impostoInterface;
    }

    public Double vender() {
        Double valor = promocaoInterface.calculaPromocao(produto.getValor());
        return impostoInterface.calcula(valor);
    }
}
