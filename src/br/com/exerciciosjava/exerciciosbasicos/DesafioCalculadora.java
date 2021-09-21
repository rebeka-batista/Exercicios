package br.com.exerciciosjava.exerciciosbasicos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe a operação: ");
        String op = entrada.next();

        System.out.print("Informe o número: ");
        double num2 = entrada.nextDouble();


        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.0f %s %.0f = %.0f", num1, op, num2, resultado);
        entrada.close();
    }
}