package br.com.exerciciosjava.exerciciobanco.operacoes;

import br.com.exerciciosjava.exerciciobanco.menu.ArrayContas;
import br.com.exerciciosjava.exerciciobanco.tipoconta.Conta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Deposito implements IDeposito {
    public void  deposito (Login login){

        System.out.println(login.getNome());
        System.out.println(login.getCpf());
        System.out.println(login.getNConta());

        try{
            Scanner s = new Scanner(System.in);
            for (Conta contaLista : ArrayContas.contas){
                if (contaLista.getCpf().equals(login.getCpf())){

                    System.out.println("Seu saldo atual é: " + contaLista.getValorS());
                    System.out.println("Digite o valor que irá depositar: ");
                    Double contaP = s.nextDouble();
                    contaLista.setValorS(contaLista.getValorS() + contaP);
                    System.out.println("Seu saldo depois do depósito é: " + contaLista.getValorS());
                    return;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Digite as informações acima!");
        }
    }

}
