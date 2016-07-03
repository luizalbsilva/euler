package br.com.tamanhofamilia.euler.ex3;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeradorPrimosTest {
    private GeradorPrimos geradorPrimos = new GeradorPrimos();

    @Test
    public void testa_primeiro() {
        assertEquals(2, geradorPrimos.next(0));
    }

    @Test
    public void testa_segundo() {
        assertEquals(3, geradorPrimos.next(1));
    }

    @Test
    public void testa_terceiro() {
        assertEquals(5, geradorPrimos.next(2));
    }

    @Test
    public void testa_quarto() {
        assertEquals(11, geradorPrimos.next(4));
    }

    @Test
    public void testa_168() {
        assertEquals(997, geradorPrimos.next(167));
    }
}