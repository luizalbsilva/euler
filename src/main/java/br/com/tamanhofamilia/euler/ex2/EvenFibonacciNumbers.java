package br.com.tamanhofamilia.euler.ex2;

public class EvenFibonacciNumbers {
    private FibonacciNumbers generator = new FibonacciNumbers();
    public long soma(int primeiros) {
        long soma = 0;
        for (int x=1; x<=primeiros; x++) {
            int gerado = generator.next();
            if((gerado % 2)==0)
                soma += gerado;
        }
        return soma;
    }

    public long somaNaoExcede(int numero) {
        long soma = 0;
        int gerado;
        while((gerado = generator.next()) <= numero){
            if((gerado % 2)==0)
                soma += gerado;
        }
        return soma;
    }

    public static void main(String[] args){
        System.out.println(new EvenFibonacciNumbers().somaNaoExcede(4000000));
    }
}
