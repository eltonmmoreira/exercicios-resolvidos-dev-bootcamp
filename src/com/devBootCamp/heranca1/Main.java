package com.devBootCamp.heranca1;

import java.time.LocalDate;
import java.util.ArrayList;

import static com.devBootCamp.Util.formatarValor;

public class Main {

    public static void main(String[] args) {

//        var pessoa = new Pessoa("TESTE", "11111111111");
//        System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
//
//        var funcionario = new Funcionario("TESTE", "22222222222", 3000D, LocalDate.now());
//        System.out.println(formatarValor(funcionario.calcularSalario()));

        var financeiro = new Financeiro("Financeiro", "00000000000", 3400D, LocalDate.now());
        System.out.println(formatarValor(financeiro.calcularSalario()));

        var curso = new Curso("ADS", 4);

        var professor = new Professor("Diones", "11111111111", 6500.00, LocalDate.now());
        var professorCurso = new ProfessorCurso(curso);
        professorCurso.setPercentual(10D);
        professor.adicionarCurso(professorCurso);
        System.out.println("Salário calculado: " + formatarValor(professor.calcularSalario()));

        System.out.println();
        var aluno = new Aluno("Aluno", "11111111111");
        System.out.println("Matricula: " + aluno.matricularAluno(curso));
        System.out.println("Matricula: " + aluno.matricularAluno(curso));
        for (CursoMatricula cursoMatricula : aluno.getCursoMatriculaList()) {
            System.out.println("Matricula: " + cursoMatricula.getMatricula());
            System.out.println("Curso: " + cursoMatricula.getCurso().getNome());
        }

        System.out.println("**************************************************");
        var relatorio = new RelatorioSalario();
//        relatorio.resumoSalario(professor);
//        relatorio.resumoSalario(financeiro);


        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(professor);
        funcionarios.add(financeiro);
        relatorio.resumoSalario(funcionarios);
    }
}
