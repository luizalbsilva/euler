package br.com.tamanhofamilia.euler.ex1;

import java.util.stream.IntStream;

public class Multiples3And5 {
    public static void main(String[] args) {
        System.out.println( IntStream.range(1, 1000).filter(n->(n%3==0) || (n%5==0)).sum());
    }
}
