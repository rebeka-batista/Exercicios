package br.com.exerciciosjava.exercicioswitch;

import java.util.Scanner;

public class ExercicioSwitch {

    /* Faça um programa que converta um valor em Real para uma das seguintes moedas:
    Tipos de Moeda:
    1 - USD
    2 - EUR
    3 - YEM
    4 - VEF
    Caso não exista, informar que a moeda não está habilitada a conversão  */

    public static void main(String[] args) {
        Double reais, conversao;
        int opcao;

        System.out.println("Conversor de Moedas: ");
        System.out.println("1 - Dolar");
        System.out.println("2 - Euro");
        System.out.println("3 - Yens");
        System.out.println("4 - VEF");

        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma opção: ");
        opcao = s.nextInt();

        System.out.println("Digite um número das moedas acima para converter de Reais");
        reais = s.nextDouble();

        switch (opcao) {
            case 1:
                conversao = 5.55 * reais;
                System.out.println("O valor em Dólares que você tem é: " + conversao);
                break;

            case 2:
                conversao = 5.56 * reais;
                System.out.println("O valor em Euros que você tem é: " + conversao);
                break;

            case 3:
                conversao = 0.054 * reais;
                System.out.println("O valor em Yens que você tem é: " + conversao);
                break;

            case 4:
                conversao = 0.000011 * reais;
                System.out.println("O valor em Bolivar Venezuelano que você tem é: " + conversao);
                break;

            default:
                System.out.println("Informe uma moeda que está habilitada a conversão!");
        }
    }
}
