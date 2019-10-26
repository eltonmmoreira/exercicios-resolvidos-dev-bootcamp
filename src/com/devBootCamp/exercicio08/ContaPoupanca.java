package com.devBootCamp.exercicio08;

import java.text.DecimalFormat;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
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
    }

    @Override
    protected void depositar(Double valor) {
        saldo += valor;

        if (saldo > 0) {
            limiteRestante = limite;
        }
    }

    public Double getLimiteRestante() {
        return limiteRestante;
    }

    @Override
    public void mostrarDados() {
        var formatter = new DecimalFormat("#,##0.00");
        System.out.println("Conta Poupança: ");
        System.out.println(numeroConta);
        System.out.println("Limite: ");
        System.out.println(formatter.format(limite));
        System.out.println("Saldo: ");
        System.out.println(formatter.format(saldo));
    }
}
