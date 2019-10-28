package com.devBootCamp.heranca1;

public class Curso {
    private String nome;
    private Integer duracao;

    public Curso(String nome, Integer duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }
}
