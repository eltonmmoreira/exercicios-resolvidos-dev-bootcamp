package com.devBootCamp.heranca1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private List<ProfessorCurso> professorCursoList = new ArrayList<>();

    public Professor(String nome, String cpf, Double salario, LocalDate dataAdmissao) {
        super(nome, cpf, salario, dataAdmissao);
    }

    public List<ProfessorCurso> getProfessorCursoList() {
        return professorCursoList;
    }

    public void adicionarCurso(ProfessorCurso professorCurso) {
        professorCursoList.add(professorCurso);
    }

    @Override
    public Double calcularSalario() {
        var percentual = 0D;
        for (ProfessorCurso professorCurso : professorCursoList) {
            percentual += professorCurso.getPercentual();
        }

        var salario = super.calcularSalario();
        salario = salario + (salario * percentual) / 100;
        return salario;
    }
}
