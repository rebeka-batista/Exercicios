package br.com.exerciciosjava.exerciciosbasicos;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudvel = !comprouSorvete;


        System.out.println("Comprou TV 50'? " + comprouTV50);
        System.out.println("Comprou TV 32'? " + comprouTV32);
        System.out.println("Comprou sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudvel);

    }
}
