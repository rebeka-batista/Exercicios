package br.com.exerciciosjava.exerciciocomposicao1;

public class Item {
    String nome;
    int quant;
    double preco;
    Compra compra;

    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quant = quantidade;
        this.preco = preco;
    }
}
