package br.com.exerciciosjava.exerciciobanco.menu;

import br.com.exerciciosjava.exerciciobanco.gerencia.ListarConta;
import br.com.exerciciosjava.exerciciobanco.gerencia.RemoverConta;
import br.com.exerciciosjava.exerciciobanco.operacoes.Deposito;
import br.com.exerciciosjava.exerciciobanco.operacoes.Login;
import br.com.exerciciosjava.exerciciobanco.operacoes.Saque;
import br.com.exerciciosjava.exerciciobanco.tipoconta.AbrirContaC;
import br.com.exerciciosjava.exerciciobanco.tipoconta.AbrirContaP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuBanco {
    public static void main(String[] args) {

        int escolha = 0;
        boolean enquanto = true;
        Scanner s;

        AbrirContaP opcaoP = new AbrirContaP();
        AbrirContaC opcapC = new AbrirContaC();
        Deposito deposito = new Deposito();
        Saque saque = new Saque();
        Login login = new Login();
        ListarConta listarConta = new ListarConta();
        RemoverConta removerConta = new RemoverConta();
        SairDoSist sairDoSistema = new SairDoSist();

        while (enquanto) {

            System.out.println("\n          ---BANCO---" +
                    "\nPara efetuar operações em nosso Sistema, " +
                    "\né necessário estar Cadastrado!"
                    + "\n\nPara cadastrar sua Conta Corrente digite 1"
                    + "\nPara cadastrar sua Conta Poupança digite 2"
                    + "\nPara fazer Depósito digite 3"
                    + "\nPara fazer Saque digite 4"
                    + "\n"
                    + "\nSe você é Gerente: "
                    + "\nPara listar as Conta digite 5"
                    + "\nPara remover uma Conta digite 6"
                    + "\nPara sair do Sistema digite 7");

            try {
                s = new Scanner(System.in);
                escolha = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite uma das opções acima!");
            }

            switch (escolha) {
                case 1:
                    opcapC.abrirContaC();
                    break;

                case 2:
                    opcaoP.abrirContaP();
                    break;

                case 3:
                    Login cliente = login.loginCliente();
                    deposito.deposito(cliente);
                    break;

                case 4:
                    login = login.loginCliente();
                    saque.saque(login);
                    break;

                case 5:
                    listarConta.listarConta();
                    break;

                case 6:
                    removerConta.removerConta();
                    break;

                case 7:
                    sairDoSistema.sairDoSistema();
                    enquanto = false;
                    break;

                default:
                    System.out.println("Opção não encontrada!");
            }
        }
    }
}
