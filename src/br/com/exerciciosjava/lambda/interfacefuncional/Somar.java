package br.com.exerciciosjava.lambda.interfacefuncional;

public class Somar implements Calculo {

    // metodo para soma
    public double executar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // utilizando lambda para soma:
        Calculo calculo = (x,y) -> x + y;
        System.out.println(calculo.executar(2,3));

    }

}
