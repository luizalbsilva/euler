package br.com.tamanhofamilia.euler.ex3;

import org.junit.Test;

import static org.junit.Assert.*;


public class LargestPrimeFactorTest {
    private LargestPrimeFactor larger = new LargestPrimeFactor();

    @Test
    public void num_1() {
        assertEquals(1, larger.primeDivisorOf(1));
    }

    @Test
    public void num_2() {
        assertEquals(2, larger.primeDivisorOf(2));
    }

    @Test
    public void num_3() {
        assertEquals(3, larger.primeDivisorOf(3));
    }

    @Test
    public void num_4() {
        assertEquals(2, larger.primeDivisorOf(4));
    }

    @Test
    public void num_5() {
        assertEquals(5, larger.primeDivisorOf(5));
    }
}