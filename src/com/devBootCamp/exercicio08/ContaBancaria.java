package com.devBootCamp.exercicio08;

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
}
