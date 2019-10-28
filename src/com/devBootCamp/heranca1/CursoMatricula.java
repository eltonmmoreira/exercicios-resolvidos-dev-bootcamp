package com.devBootCamp.heranca1;

import java.time.LocalDate;
import java.util.Random;

public class CursoMatricula {
    private Integer matricula;
    private Curso curso;
    private LocalDate dataInicial;

    public CursoMatricula(Curso curso, LocalDate dataInicial) {
        this.curso = curso;
        this.dataInicial = dataInicial;
        matricula = new Random().nextInt();
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }
}
