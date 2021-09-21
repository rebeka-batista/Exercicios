package br.com.exerciciosjava.gettersandsetters;

public class Pessoa {

    private String nome;
    private Integer idade;

    //construtor
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //getter
    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    //setter
    public void setIdade(Integer novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString() {
        return "Olá, eu sou " + getNome() + " e tenho " + getIdade() + " anos.";
    }

}
