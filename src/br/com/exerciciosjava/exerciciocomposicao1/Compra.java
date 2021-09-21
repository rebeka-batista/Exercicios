package br.com.exerciciosjava.exerciciocomposicao1;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(String nome, int quant, double preco) {
        this.adicionarItem(new Item(nome, quant, preco));
    }

    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    double obterValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quant * item.preco;
        }
        return total;
    }

}
