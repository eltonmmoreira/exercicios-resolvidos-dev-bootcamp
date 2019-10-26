package com.devBootCamp.exercicio07;

import java.text.DecimalFormat;

public class ContaPoupanca extends ContaBancaria {
    private Double limite;
    private Double limiteRestante;

    public ContaPoupanca(Integer numeroConta, Double limite) {
        super(numeroConta);
        this.limite = limite;
    }

    @Override
    protected void sacar(Double valor) {
        var valorDisponivel = saldo + limite;
        if (valor > valorDisponivel) {
            System.out.println("Não foi possível realizar o saque, valor maior que o disponível");
            return;
        }

        if (valor > saldo) {
            limiteRestante -= valor - saldo;
        }
        saldo -= valor;
        var formatter = new DecimalFormat("#,##0.00");
        System.out.println("Saque realizado no valor de: " + formatter.format(valor));
        System.out.println("Limite: " + formatter.format(limiteRestante));
        System.out.println("Saldo: " + formatter.format(saldo));
    }

    @Override
    protected void depositar(Double valor) {
        saldo += valor;

        if (saldo > 0) {
            limiteRestante = limite;
        }

        var formatter = new DecimalFormat("#,##0.00");
        System.out.println("Depósito realizado no valor de: " + formatter.format(valor));
        System.out.println("Limite: " + formatter.format(limiteRestante));
        System.out.println("Saldo: " + formatter.format(saldo));
    }

    public Double getLimiteRestante() {
        return limiteRestante;
    }
}
