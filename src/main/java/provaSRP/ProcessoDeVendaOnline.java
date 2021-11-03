package provaSRP;


/* Esta classe:
    Recebe uma classe funcionário, que tem um cargo e um salário base.
    Retorna o salário líquido do funcionário
*/

import static provaSRP.TipoProduto.*;

class ProcessoDeVendaOnline {
    private static final double TAXA_FIXA_DE_IMPORTACAO = 150;

    public double calcula(Float valorTotal, TipoProduto tipoProduto) {

        if (SERVICOS.equals(tipoProduto)) {
            return valorTotal * 0.8;
        } else if (COMIDA.equals(tipoProduto)) {
            return dezPorcentoParaComida(valorTotal);
        } else if (IMPORTADO.equals(tipoProduto)) {
            return calcularImpostoImportado(valorTotal);
        }

        throw new RuntimeException("Tipo de produto inválido");
    }

    private double calcularImpostoImportado(Float valorTotal) {
        if(valorTotal > 500) {
            return (valorTotal * 0.6) + TAXA_FIXA_DE_IMPORTACAO;
        } else {
            return valorTotal * 0.7;
        }
    }

    private double dezPorcentoParaComida(Float valorTotal) {
        return valorTotal * 0.9;
    }
}

