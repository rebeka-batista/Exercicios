package br.com.exerciciosjava.exerciciocomposicao2;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;
    List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

}
