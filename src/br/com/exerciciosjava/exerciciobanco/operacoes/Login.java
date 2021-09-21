package br.com.exerciciosjava.exerciciobanco.operacoes;


import java.util.Scanner;

public class Login implements ILogin {
    private String nome;
    private Long cpf;
    private Integer nConta;
    Scanner s = new Scanner(System.in);


    public Login loginCliente() {
        System.out.println("Digite seu nome: ");
        String nome = s.next();

        System.out.println("Digite seu CPF: ");
        Long cpf = s.nextLong();

        System.out.println("Digite o número da sua Conta: ");
        Integer nConta = s.nextInt();

        this.nome = nome;
        this.cpf = cpf;
        this.nConta = nConta;
        return this;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Integer getNConta() {
        return nConta;
    }

    public void setnConta(Integer nConta) {
        this.nConta = nConta;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }
}
