package br.com.tamanhofamilia.euler.ex2;

public class FibonacciNumbers {
    private int actual=1, last=1;

    public int next() {
        int old = last;
        last = actual;
        actual += old;
        return last;
    }
}
