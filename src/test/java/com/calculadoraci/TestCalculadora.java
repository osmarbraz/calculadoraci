package com.calculadoraci;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestCalculadora {

    @Test
    void testGetSoma() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);

        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getSoma();

        assertEquals(retornoEsperado, retornoFeito, 0);
    }   
    
    @Test
    void testGetDiferenca() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getDiferenca();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}

