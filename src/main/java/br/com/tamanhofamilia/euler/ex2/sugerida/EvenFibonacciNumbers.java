package br.com.tamanhofamilia.euler.ex2.best;

import br.com.tamanhofamilia.euler.ex2.FibonacciNumbers;

public class EvenFibonacciNumbers {
    public long somaNaoExcede(int numero) {
        int a=1,b=1,c=2;
        long soma=0;
        while (c<numero) {
            soma += c;
            a = b + c;
            b = a + c;
            c = b + a;
        }
        return soma;
    }

    public static void main(String[] args){
        System.out.println(new EvenFibonacciNumbers().somaNaoExcede(4000000));
    }
}
