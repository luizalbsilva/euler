package br.com.tamanhofamilia.euler.ex3.melhorada;

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

        outter:while(true) {
            ultimo +=2;
            int limite = (int) Math.sqrt(ultimo);
            for (int x : numberList) {
                if (x > limite) {
                    numberList.add(ultimo);
                    return;
                }
                if ((ultimo % x) == 0)
                    continue outter;
            }
        }
    }
}
