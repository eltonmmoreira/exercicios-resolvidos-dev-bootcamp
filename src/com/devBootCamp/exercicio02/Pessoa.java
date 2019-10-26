package com.devBootCamp.exercicio02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate dataDeNascimento;

    public Pessoa(String nome, String cpf, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNomeFormatado() {
        return nome + " - " + sobrenome;
    }

    public Integer getIdade() {
        return Long.valueOf(ChronoUnit.YEARS.between(dataDeNascimento, LocalDate.now())).intValue();
    }
}
