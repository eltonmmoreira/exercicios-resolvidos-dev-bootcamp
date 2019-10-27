package com.devBootCamp.exercicio13;

public class Elevador {
    private Integer andarAtual;
    private Integer totalDeAndares;
    private Integer capacidadeDoElevador;
    private Integer quantidadePessoas;

    public Elevador(Integer totalDeAndares, Integer capacidadeDoElevador) {
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDoElevador = capacidadeDoElevador;
        andarAtual = 0;
        quantidadePessoas = 0;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public Integer getTotalDeAndares() {
        return totalDeAndares;
    }

    public Integer getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void entrar() {
        if (!quantidadePessoas.equals(capacidadeDoElevador)) {
            quantidadePessoas++;
        } else {
            System.out.println("Capacidade do elevador já atingida");
        }
    }

    public void sair() {
        if (quantidadePessoas > 0) {
            quantidadePessoas--;
        } else {
            System.out.println("Elevador já está vazio");
        }
    }

    public void subir() {
        if (!andarAtual.equals(totalDeAndares)) {
            andarAtual++;
        } else {
            System.out.println("Elevador já está no último andar");
        }
    }

    public void descer() {
        if (!andarAtual.equals(0)) {
            andarAtual--;
        } else {
            System.out.println("Elevador já está no térreo");
        }
    }
}
