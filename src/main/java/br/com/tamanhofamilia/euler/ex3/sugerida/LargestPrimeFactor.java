package br.com.tamanhofamilia.euler.ex3.sugerida;

/* ******************************************
 * Menos eficiente para grandes números, consome 13s464 para Long.MAX_VALUE
 */
public class LargestPrimeFactor {
    private int pegaMaiorDivisor(long numero) {
        int divisor = 3, limite = (int) Math.sqrt(numero), maior=1;
        while (divisor < limite) {
            if (numero % divisor == 0) {
                maior = divisor;
                while (numero % divisor == 0) {
                    numero /= divisor;
                }
            }
            divisor+=2;
        }
        return maior;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(new LargestPrimeFactor().pegaMaiorDivisor(600851475143l));
        System.out.println(System.currentTimeMillis() - a);
    }
}
