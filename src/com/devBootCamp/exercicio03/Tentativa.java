package com.devBootCamp.exercicio03;

public class Tentativa {
    private Livro livro;
    private Integer quantidade;

    public Tentativa(Livro livro, Integer quantidade) {
        this.livro = livro;
        this.quantidade = quantidade;
    }

    public Livro getLivro() {
        return livro;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void addTentativa() {
        this.quantidade += 1;
    }
}
