package com.devBootCamp.exercicio03;

import java.time.LocalDate;

public class Emprestimo {
    private Aluno aluno;
    private Livro livro;
    private LocalDate dateEmprestimo;
    private LocalDate dataDevolucaoEstimada;

    public Emprestimo(Aluno aluno, Livro livro, LocalDate dateEmprestimo, LocalDate dataDevolucaoEstimada) {
        this.aluno = aluno;
        this.livro = livro;
        this.dateEmprestimo = dateEmprestimo;
        this.dataDevolucaoEstimada = dataDevolucaoEstimada;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDateEmprestimo() {
        return dateEmprestimo;
    }

    public void setDateEmprestimo(LocalDate dateEmprestimo) {
        this.dateEmprestimo = dateEmprestimo;
    }

    public LocalDate getDataDevolucaoEstimada() {
        return dataDevolucaoEstimada;
    }

    public void setDataDevolucaoEstimada(LocalDate dataDevolucaoEstimada) {
        this.dataDevolucaoEstimada = dataDevolucaoEstimada;
    }
}
