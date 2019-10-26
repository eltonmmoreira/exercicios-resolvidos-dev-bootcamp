package com.devBootCamp.exercicio09;

import java.util.Objects;

public abstract class ContaBancaria {
    protected Integer numeroConta;
    protected Double saldo;

    public ContaBancaria(Integer numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0D;
    }

    protected void sacar(Double valor) {

    }

    protected void depositar(Double valor) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaBancaria that = (ContaBancaria) o;
        return Objects.equals(numeroConta, that.numeroConta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta);
    }
}
