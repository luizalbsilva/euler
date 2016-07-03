package br.com.tamanhofamilia.euler.ex1.best;

import java.util.stream.IntStream;

public class Multiples3And5 {
    private final int limiteSuperior;

    public Multiples3And5(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public static void main(String[] args) {
        new Multiples3And5(999).run();
    }

    private void run() {
        System.out.printf("Soma: %d",somaPA(3)+somaPA(5)-somaPA(15));
    }

    private int somaPA(int numero) {
        int primeiroItem = numero,
                quantidadeItems = limiteSuperior / numero,
                ultimoItem = quantidadeItems * numero,
                soma = (primeiroItem + ultimoItem) * quantidadeItems / 2;
        System.out.printf("\n(%d + %d) %d / 2 = %d\n", primeiroItem, ultimoItem, quantidadeItems, soma);
        return soma;
    }
}
