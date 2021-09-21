package br.com.exerciciosjava.exerciciobanco.tipoconta;


public class Conta {

    private String nome;
    private Long cpf;
    private double valorS;
    private Integer numConta;

    public Conta() {
    }

    @Override
    public String toString() {
        return "Conta " +
                "\nNome: " + nome +
                "\nCpf: " + cpf +
                "\nNúmero da Conta: " + numConta +
                "\nValor: " + valorS;
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

    public double getValorS() {
        return valorS;
    }

    public void setValorS(double valorS) {
        this.valorS = valorS;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }
}
