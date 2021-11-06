package provaSRP;

public class ImpostoDeImportado {
    private static final double TAXA_FIXA_DE_IMPORTACAO = 150;

    public double calcula(double valorTotal) {
        if(valorTotal > 500) {
            return (valorTotal * 1.4) + TAXA_FIXA_DE_IMPORTACAO;
        } else {
            return valorTotal * 1.3;
        }
    }

}
