package com.calculadoraci;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestCalculadora {

    @Test
    void testGetAdicao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);

        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao();

        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}

