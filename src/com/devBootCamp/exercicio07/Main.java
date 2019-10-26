package com.devBootCamp.exercicio07;

public class Main {

    public static void main(String[] args) {
//        var contaCorrente = new ContaCorrente(123, 2.00);
//        contaCorrente.depositar(10D);
//        contaCorrente.depositar(100D);
//        contaCorrente.depositar(200D);
//        contaCorrente.sacar(30D);
//        contaCorrente.sacar(500D);

        var contaPoupanca = new ContaPoupanca(321, 10D);
        contaPoupanca.depositar(10D);
        contaPoupanca.sacar(12D);

        contaPoupanca.depositar(100D);
        contaPoupanca.depositar(10D);
        contaPoupanca.sacar(117D);
    }
}
