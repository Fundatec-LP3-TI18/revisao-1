package exemplos.solid.dip;

public class VendaService {

    public Float totalVenda;
    public Produto produto;
    private PromocaoInterface promocao;

    public VendaService(Produto produto,
                        PromocaoInterface promocao
                        ) {
        this.produto = produto;
        this.promocao = promocao;
    }

    public Float vender(){
        System.out.println("Iniciando venda");



        new EnviarEmail().enviarEmail();

        this.totalVenda =  promocao.calcula(this.produto.getValor()); // 8

        if(this.totalVenda == 100)
            return 1f;
        else if (this.totalVenda == 200)
            return 2f;





        return 0f;
    }




}
