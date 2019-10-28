package com.devBootCamp.heranca1;

public class ProfessorCurso {
    private Curso curso;
    private Double percentual;

    public ProfessorCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }
}
