package com.devBootCamp.exercicio08;

import java.text.DecimalFormat;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
    private Double taxaDeOperacao;

    public ContaCorrente(Integer numeroConta, Double taxaDeOperacao) {
        super(numeroConta);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    protected void sacar(Double valor) {
        if ((valor + taxaDeOperacao) > saldo) {
            System.out.println("Não foi possível realizar o saque, valor maior que o disponível");
            return;
        }
        saldo -= valor - taxaDeOperacao;
    }

    @Override
    protected void depositar(Double valor) {
        if ((valor + saldo) < taxaDeOperacao) {
            System.out.println("Não foi possível realizar o depósito, pois o saldo final é menor que a taxa de operação");
            return;
        }
        saldo += valor - taxaDeOperacao;
    }

    @Override
    public void mostrarDados() {
        var formatter = new DecimalFormat("#,##0.00");
        System.out.println("Conta Corrente: ");
        System.out.println(numeroConta);
        System.out.println("Taxa de Operação: ");
        System.out.println(formatter.format(taxaDeOperacao));
        System.out.println("Saldo: ");
        System.out.println(formatter.format(saldo));
    }
}
