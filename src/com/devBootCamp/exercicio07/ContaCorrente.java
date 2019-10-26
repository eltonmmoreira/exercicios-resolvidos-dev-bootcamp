package com.devBootCamp.exercicio07;

import java.text.DecimalFormat;

public class ContaCorrente extends ContaBancaria {
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

        var formatter = new DecimalFormat("#,##0.00");
        System.out.println("Saque realizado no valor de: " + formatter.format(valor));
        System.out.println("Saldo: " + formatter.format(saldo));
    }

    @Override
    protected void depositar(Double valor) {
        if ((valor + saldo) < taxaDeOperacao) {
            System.out.println("Não foi possível realizar o depósito, pois o saldo final é menor que a taxa de operação");
            return;
        }
        saldo += valor - taxaDeOperacao;

        var formatter = new DecimalFormat("#,##0.00");
        System.out.println("Depósito realizado no valor de: " + formatter.format(valor));
        System.out.println("Saldo: " + formatter.format(saldo));
    }
}
