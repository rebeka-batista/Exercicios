package br.com.exerciciosjava.exerciciobanco.tipoconta;

import br.com.exerciciosjava.exerciciobanco.menu.ArrayContas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AbrirContaP implements ContaPoupanca {
    public void abrirContaP() {
        try {
            Conta conta = new Conta();
            Scanner s = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = s.next();

            System.out.println("Digite seu CPF: ");
            Long cpf = s.nextLong();
            s.nextLine();

            System.out.println("Digite o número da sua Conta: ");
            Integer nConta = s.nextInt();
            s.nextLine();

            System.out.println("Digite o valor do seu Saldo: ");
            Double saldo = s.nextDouble();

            conta.setNome(nome);
            conta.setCpf(cpf);
            conta.setNumConta(nConta);
            conta.setValorS(saldo);
            ArrayContas.contas.add(conta);
        } catch (InputMismatchException e) {
            System.out.println("Digite as informações corretamente para seu cadastro de Conta Poupança");
        }
    }
}
