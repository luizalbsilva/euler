package br.com.tamanhofamilia.euler.ex3.melhorada;

/* ************************************************************************************************************
 * Muito mais eficiente que o código sugerido, no caso de grandes números, com Long.MAX_VALUE (cerca de 184ms), graças
 * a dica que se não tiver um divisor abaixo da raiz do número é primo.
 */
public class LargestPrimeFactor {

    public int primeDivisorOf(int numero) {
        if (numero > 1) {
            return pegaMaiorDivisor(numero);
        }
        return 1;
    }
    private GeradorPrimos gp = new GeradorPrimos();

    private int pegaMaiorDivisor(long numero) {
        int posicao = 0;
        int primo = gp.next(posicao);
        while (numero > 1) {
            if (numero % primo == 0) {
                numero /= primo;
                continue;
            }
            primo = gp.next(++posicao);
        }
        return primo;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(new LargestPrimeFactor().pegaMaiorDivisor(600851475143l));
        System.out.println(System.currentTimeMillis() - a);
    }
}
