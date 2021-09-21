package br.com.exerciciosjava.lambda.interfacefuncional;

public class CalculoTeste1 {
    public static void main(String[] args) {

        // nesse caso, utilizamos os metodos criados numa classe a parte, apenas chamamos e executamos!
        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2, 3));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(2, 3));

    }
}
