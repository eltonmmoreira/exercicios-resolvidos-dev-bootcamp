package com.devBootCamp.exercicio04;

public class Empregado extends Pessoa {
    private Double salarioBase;
    private Double impostos;

    public Empregado(String nome, String cpf, Double salarioBase, Double impostos) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.impostos = impostos;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Double getImpostos() {
        return impostos;
    }

    public Double calcularSalario() {
        return salarioBase - impostos;
    }
}
