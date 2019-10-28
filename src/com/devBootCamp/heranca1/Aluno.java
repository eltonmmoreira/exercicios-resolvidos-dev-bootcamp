package com.devBootCamp.heranca1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<CursoMatricula> cursoMatriculaList = new ArrayList<>();

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    public List<CursoMatricula> getCursoMatriculaList() {
        return cursoMatriculaList;
    }

    public Integer matricularAluno(Curso curso) {
        for (CursoMatricula cursoMatricula : cursoMatriculaList) {
            if (cursoMatricula.getCurso().getNome().equals(curso.getNome())) {
                System.out.println("Aluno já matriculado no curso: " + curso.getNome());
                return null;
            }
        }
        var cursoMatricula = new CursoMatricula(curso, LocalDate.now());
        cursoMatriculaList.add(cursoMatricula);
        return cursoMatricula.getMatricula();
    }
}
