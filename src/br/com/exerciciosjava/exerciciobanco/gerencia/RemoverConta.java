package br.com.exerciciosjava.exerciciobanco.gerencia;

import br.com.exerciciosjava.exerciciobanco.menu.ArrayContas;
import br.com.exerciciosjava.exerciciobanco.tipoconta.Conta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoverConta implements Remover {

    public void removerConta() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite o CPF a ser removido");
            Long cpfRemov = s.nextLong();

            for (Conta contaLista : ArrayContas.contas) {
                if (contaLista.getCpf().equals(cpfRemov)) {
                    ArrayContas.contas.remove(contaLista);
                    System.out.println("Conta Removida!!");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Digite um CPF cadastrado para remoção!");
        }
    }
}
