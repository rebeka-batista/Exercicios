package br.com.exerciciosjava.exerciciosbasicos;

import java.util.Scanner;

public class DesafioTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base:");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.print("A área do triângulo é: " + area);

        scanner.close();
    }
}
