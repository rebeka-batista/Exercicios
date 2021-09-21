package br.com.exerciciosjava.exercicioarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArray2 {

    /*
        Faça um programa que verifique se já existe um cadastro referente ao solicitado em nosso estoque.
        Caso exista, ele removerá o código informado, caso não exista, cadastre.
        Ao final da consulta/ remoção, listar todos os produtos cadastrados
     */

    public static void main(String[] args) {
        int novoCodigo;
        Scanner s = new Scanner(System.in);
        List<Integer> codigo = new ArrayList<>();

        codigo.add(5001);
        codigo.add(5002);
        codigo.add(5003);
        codigo.add(5004);
        codigo.add(5005);

        System.out.println("Digite o código do Produto: ");
        novoCodigo = s.nextInt();

        for (int i = 0; i < codigo.size(); i++) {

            if (codigo.get(i) == novoCodigo) {
                codigo.remove(codigo.get(i));
                System.out.println("Produto removido com sucesso!!");
                break;
            }
            else if (i == (codigo.size() - 1)) {
                System.out.println("Produto não encontrado!");
            }
        }
        System.out.println(codigo);
    }
}
