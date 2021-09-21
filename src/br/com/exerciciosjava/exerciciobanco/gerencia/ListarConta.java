package br.com.exerciciosjava.exerciciobanco.gerencia;

import br.com.exerciciosjava.exerciciobanco.menu.ArrayContas;
import br.com.exerciciosjava.exerciciobanco.tipoconta.Conta;

public class ListarConta implements Listar {
    public void listarConta() {
        for (Conta contaLista : ArrayContas.contas) {
            System.out.println(contaLista);
        }
    }
}
