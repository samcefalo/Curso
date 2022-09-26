package me.samcefalo.teorico;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    public static void main(String[] args) {
        /*
        if -> if(condicao) {}
        else -> else {}
        while -> while(condicao) {}
        for -> for(int i; i < 0 ;i++) {} ou for(int i: array/list)
         */

        List<Integer> lista = new ArrayList<>();

        // Condicional

        if (1 < 2) {

        } else {

        }

        if (1 < 2 && 2 < 3) {

        } else if (5 != 0 || 8 < 1) {

        }

        int a = 0;

        //Repetição

        while (a < 1) {
            a++;
        }

        boolean l = true;

        while (l) {
            l = false;
        }

        for (int i = 0; i < 10; i++) {

        }

        for (int i : lista) {

        }

        for (int i : new int[5]) {

        }

        do {
            l = false;
        } while (l);

    }
}
