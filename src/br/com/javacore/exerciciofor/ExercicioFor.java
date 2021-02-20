package br.com.javacore.exerciciofor;

import java.util.ArrayList;
import java.util.List;

public class ExercicioFor {
    /*
    Faça um programa que mostre todas as minhas compras feitas no cartão de crédito e também um valor
    final com a soma de todas as mesmas
    Total de compras: 7 itens
    */

    public static void main(String[] args) {
     double valorTotal = 0.0D;

        List<String[]> Compras = new ArrayList<>();

        Compras.add(new String[]{"Havaianas", "20.00"});
        Compras.add(new String[]{"Blusinha", "50.00"});
        Compras.add(new String[]{"Chapinha", "300.00"});
        Compras.add(new String[]{"Notebook", "2000.00"});
        Compras.add(new String[]{"Tenis", "150.00"});
        Compras.add(new String[]{"Calça Jeans", "200.00"});
        Compras.add(new String[]{"Mochila", "200.00"});
        System.out.println("\n-- Suas compras são: --");

        for (String[] itens : Compras) {
            System.out.println("Item: " + itens[0] + "\nPreço R$ " + Double.parseDouble(itens[1]));
            valorTotal += Double.parseDouble(itens[1]);

            System.out.println("\nO valor total da sua compra é: R$" + valorTotal);
        }
    }
}
