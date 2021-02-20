package br.com.javacore.exerciciofibonacci;

import java.util.ArrayList;

public class ExercicioFibonacci {
    /*
    Imprima os 10 primeiros numeros da sequencia de Fiboacci de trás pra frente
     */

    public static void main(String[] args) {
        System.out.println("\n\n---   Desafio: Sequência de Fibonacci   ---");
        ArrayList<Integer> list = new ArrayList<>();

        Integer[] r = new Integer[11];

        r[0] = 0;
        r[1] = 1;
        r[2] = 1;
        r[3] = 2;
        r[4] = 3;
        r[5] = 5;
        r[6] = 8;
        r[7] = 13;
        r[8] = 21;
        r[9] = 34;
        r[10] = 55;

        for (int i = r.length; i > 0; i--) {
            System.out.println(r[i - 1]);
        }
    }
}
