package br.com.tamanhofamilia.euler.ex2;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciNumbersTest {
    private FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
    @Test
    public void s1() {
        assertEquals(1, fibonacciNumbers.next());
    }

    @Test
    public void s2() {
        fibonacciNumbers.next();
        assertEquals(2, fibonacciNumbers.next());
    }

    @Test
    public void s3() {
        fibonacciNumbers.next();
        fibonacciNumbers.next();
        assertEquals(3, fibonacciNumbers.next());
    }

    @Test
    public void s4() {
        fibonacciNumbers.next();
        fibonacciNumbers.next();
        fibonacciNumbers.next();
        assertEquals(5, fibonacciNumbers.next());
    }

    @Test
    public void s5() {
        fibonacciNumbers.next();
        fibonacciNumbers.next();
        fibonacciNumbers.next();
        fibonacciNumbers.next();
        assertEquals(8, fibonacciNumbers.next());
    }
}