package br.com.exerciciosjava.lambda.interfacefuncional;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        // Utilizando uma interface funcional do Java
        BinaryOperator<Double> outroCalculo = (x, y) -> {
            return x + y;
        };
        System.out.println(outroCalculo.apply(2.0, 3.0));
    }
}
