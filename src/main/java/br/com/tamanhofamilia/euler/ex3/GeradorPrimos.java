package br.com.tamanhofamilia.euler.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeradorPrimos {
    private List<Integer> numberList = new ArrayList<>(Arrays.asList(2,3));
    public int next(int posicao) {
        while (posicao>=numberList.size()){
            geraProximo();
        }

        return numberList.get(posicao);
    }

    private void geraProximo() {
        int ultimo = numberList.get(numberList.size()-1);
        int metade = ultimo /2;

        outter:while(true) {
            ultimo +=2;
            for (int x : numberList) {
                if (x > metade) {
                    numberList.add(ultimo);
                    return;
                }
                if ((ultimo % x) == 0)
                    continue outter;
            }
        }
    }
}
