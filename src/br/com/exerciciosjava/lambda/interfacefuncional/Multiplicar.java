package br.com.exerciciosjava.lambda.interfacefuncional;

public class Multiplicar implements Calculo {

    // metodo para multiplicacao
    public double executar(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        //lambda para multiplicacao
        Calculo calculo = (x,y) -> x * y;
        System.out.println(calculo.executar(2, 3));

    }

}
