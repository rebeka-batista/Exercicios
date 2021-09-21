package br.com.exerciciosjava.exerciciosbasicos;

import java.util.Scanner;

public class DesafioConversao {
     /*
    Faça um programa que calcule a média de 3 salários e que aceite "." ou "," sem dar erros.
    Mas os valores devem ser Strings e você deverá convertê-los para double
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu primeiro salário: ");
        String salario1 = s.next().replace(",", ".");

        System.out.println("Digite seu segundo salário: ");
        String salario2 = s.next().replace(",", ".");

        System.out.println("Digite seu terceiro salário: ");
        String salario3 = s.next().replace(",", ".");

        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);

        double media = ((s1 + s2 + s3) / 3);
        System.out.printf("A média do seu salário é: %.2f", media);
    }
}
