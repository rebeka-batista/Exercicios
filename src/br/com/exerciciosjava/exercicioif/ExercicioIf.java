package br.com.exerciciosjava.exercicioif;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioIf {
    /*
    Preciso inserir um valor inteiro, e que o programa verifique se ele se adequa nas seguintes condições:
    - Se o valor for acima de 100, em 1 mês ele terá acréscimo de 10%
    - Se o valor for acima de 1000, em 1 mês ele terá acréscimo de 30%
    O Programa deverá informar o valor final com acréscimos de acordo com o valor introduzido anteriormente
     */

    public static void main(String[] args) {
        double valor = 0.0;
        DecimalFormat formatValue = new DecimalFormat("#,###.00");
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        valor = s.nextDouble();

        if (valor >= 100 && valor <= 999) {
            valor *= 1.10;
            System.out.println("Em um mês terá acréscimo de 10%, ficando com: " + formatValue.format(valor));
        }

        else if (valor >= 1000) {
            valor *= 1.30;
            System.out.println("Em um mês terá acréscimo de 30%, ficando com: " + formatValue.format(valor));
        }
    }
}
