package br.com.javacore.exercicioarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArray1 {
    /*
    Faça um programa que verifique se já existe um cadastro referente ao solicitado em nosso estoque
    Ex: Inserir no programa o código 5001
    O programa verificará se já existe o código no programa e mostrará se o produto é ou não cadastrado
     */

    public static void main(String[] args) {
        Integer novoCodigo;
        Scanner s = new Scanner(System.in);
        List<Integer> codigo = new ArrayList<>();

        codigo.add(5001);
        codigo.add(5002);
        codigo.add(5003);
        codigo.add(5004);
        codigo.add(5005);

        System.out.println("Digite o código do Produto: ");
        novoCodigo = s.nextInt();

        if (codigo.contains(novoCodigo)) {
            System.out.println("Esse produto é cadastrado no sistema!");
        } else {
            System.out.println("Esse produto não está cadastrado no sistema");
        }
    }
}
