package provaSRP;

import static provaSRP.TipoProduto.*;

class ProcessoDeVendaOnlineProva {

    public double processar(double valorOriginal, TipoProduto tipoProduto) {

        if (SERVICOS.equals(tipoProduto))
            return new ImpostoDeServicos().calcula(valorOriginal);

        if (COMIDA.equals(tipoProduto))
            return new ImpostoDeComida().calcula(valorOriginal);

        if (IMPORTADO.equals(tipoProduto))
            return new ImpostoDeImportado().calcula(valorOriginal);

        // Se nao for nenhum dos tipos permitidos, joga um erro


        throw new RuntimeException("Tipo de produto inválido");


    }
}

