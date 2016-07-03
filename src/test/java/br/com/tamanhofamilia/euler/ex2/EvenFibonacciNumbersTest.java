package br.com.tamanhofamilia.euler.ex2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenFibonacciNumbersTest {
    private EvenFibonacciNumbers somador = new EvenFibonacciNumbers();

    @Test
    public void soma_primeiro() {
        assertEquals(0, somador.soma(1));
    }

    @Test
    public void soma_primeiros_2() {
        assertEquals(2, somador.soma(2));
    }

    @Test
    public void soma_primeiros_5() {
        assertEquals(10, somador.soma(5));
    }

    @Test
    public void soma_primeiros_11() {
        assertEquals(188, somador.soma(11));
    }

    @Test
    public void somaNaoExcede_numero_1() {
        assertEquals(0, somador.somaNaoExcede(1));
    }

    @Test
    public void somaNaoExcede_primeiros_2() {
        assertEquals(2, somador.somaNaoExcede(2));
    }

    @Test
    public void somaNaoExcede_primeiros_8() {
        assertEquals(10, somador.somaNaoExcede(8));
    }

    @Test
    public void somaNaoExcede_primeiros_144() {
        assertEquals(188, somador.somaNaoExcede(144));
    }
}