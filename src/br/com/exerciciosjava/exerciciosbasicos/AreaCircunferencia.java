package br.com.exerciciosjava.exerciciosbasicos;

public class AreaCircunferencia {
    public static void main(String[] args) {

        double raio = 3.4;
        final double PI = 3.14159;
        double area = PI * raio * raio;

        System.out.println("A área é: " + area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("A área é: " + area);
    }
}
