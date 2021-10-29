package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.VendaService;

import static org.junit.jupiter.api.Assertions.*;

class PromocaoPessoaFisicaTest {

    // 1 - Calcular promocao pessoa fisica
    @Test
    public void deve_calcular_promocao_pessoa_fisica_corretamente() {
        // Given - Dado que
        Double valorOriginal = 100d;
        PromocaoPessoaFisica promocaoPessoaFisica = new PromocaoPessoaFisica();

        // When - Quando
        Double resultado = promocaoPessoaFisica.calcularPromocaoPessoaFisica(valorOriginal);

        // Then - Entao
        Double resultadoEsperado = 90d;
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}