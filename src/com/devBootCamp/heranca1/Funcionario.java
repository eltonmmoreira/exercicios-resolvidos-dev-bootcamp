package com.devBootCamp.heranca1;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private Double salario;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, String cpf, Double salario, LocalDate dataAdmissao) {
        super(nome, cpf);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public Double calcularSalario() {
        return salario;
    }
}
