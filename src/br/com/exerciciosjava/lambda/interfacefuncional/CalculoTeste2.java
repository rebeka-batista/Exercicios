package br.com.exerciciosjava.lambda.interfacefuncional;

public class CalculoTeste2 {
    public static void main(String[] args) {

        // Aqui temos duas formas de utilizar lambda:
        // 1 -> usando o return:

        Calculo calculo = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo.executar(2, 3));


        // 2 -> fazendo uma expressao "resumida"
        calculo = (x, y) -> x * y;
        System.out.println(calculo.executar(2, 3));
    }
}
