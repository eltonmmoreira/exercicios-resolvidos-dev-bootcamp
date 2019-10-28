package com.devBootCamp.heranca1;

import java.time.LocalDate;

public class Financeiro extends Funcionario {
    private Integer ramal;

    public Financeiro(String nome, String cpf, Double salario, LocalDate dataAdmissao) {
        super(nome, cpf, salario, dataAdmissao);
    }

    public Integer getRamal() {
        return ramal;
    }

    public void setRamal(Integer ramal) {
        this.ramal = ramal;
    }
}
