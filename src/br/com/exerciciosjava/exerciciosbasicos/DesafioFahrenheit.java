package br.com.exerciciosjava.exerciciosbasicos;

public class DesafioFahrenheit {
    public static void main(String[] args) {
        final int A = 32;
        final double B = 5 / 9.0;
        double fahrenheit = 80;
        final double FORMULA;
        FORMULA = ((fahrenheit - A) * B);

        System.out.println("A temperatura em ºC é: " + FORMULA);

    }
}
