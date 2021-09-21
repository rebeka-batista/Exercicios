package br.com.exerciciosjava.lambda.foreachfuncional;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        // Usando o foreach:
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        // Usando o foreach funcional 1
        aprovados.forEach((nome) -> {
            System.out.println(nome + "!");
        });

        // Usando o foreach funcional 2
        aprovados.forEach(nome -> meuImprimir(nome));



        // Utilizando Method Reference 1
        aprovados.forEach(System.out::println);

        // Utilizando Method Reference 2
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }

}
