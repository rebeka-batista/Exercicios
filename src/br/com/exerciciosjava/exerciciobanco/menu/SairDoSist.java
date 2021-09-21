package br.com.exerciciosjava.exerciciobanco.menu;

public class SairDoSist implements SairDoSistema{
    public boolean sairDoSistema() {
        System.out.println("Você saiu do sistema!");
        return false;
    }
}
