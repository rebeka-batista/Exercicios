package br.com.exerciciosjava.exerciciosbasicos;

import java.util.Scanner;

public class DesafioCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double conversao = (celsius - 32) / 1.8;

        System.out.print("Temperatura em Farenheit: " + conversao);

        scanner.close();
    }
}
