package br.com.javacore.exerciciowhile;
import java.util.Scanner;

public class ExercicioWhile {
    /*
        Faça um programa que simule compras no cartão de crédito, no qual será inserido o valor da compra, e bloqueará
        ou não a próxima compra, de acordo com o limite do cartão de crédito que será de R$ 4 500,00
     */

    public static void main(String[] args) {
        final double LIMITE_CARTAO = 4.500;
        double valorAtual = 0.0D;
        boolean cartao = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("O limite do seu cartão é de R$ 4.500,00");

        while (cartao) {
            System.out.println("Insira o valor da compra: ");
            valorAtual += scanner.nextDouble();

            if ((LIMITE_CARTAO - valorAtual) > 0) {
                System.out.println("Você ainda tem disponível: " + (LIMITE_CARTAO - valorAtual));
            }

            else if (valorAtual > LIMITE_CARTAO) {
                System.out.println("Você não pode gastar mais que seu limite!");
                cartao = false;
            }
        }
    }
}
