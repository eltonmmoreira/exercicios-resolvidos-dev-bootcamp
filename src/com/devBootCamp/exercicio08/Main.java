package com.devBootCamp.exercicio08;

public class Main {

    public static void main(String[] args) {
        var contaCorrente = new ContaCorrente(123, 2.00);
        contaCorrente.depositar(10D);
        contaCorrente.mostrarDados();

        contaCorrente.depositar(100D);
        contaCorrente.mostrarDados();

        contaCorrente.depositar(200D);
        contaCorrente.mostrarDados();

        contaCorrente.sacar(30D);
        contaCorrente.mostrarDados();

        contaCorrente.sacar(500D);
        contaCorrente.mostrarDados();

        var contaPoupanca = new ContaPoupanca(321, 10D);
        contaPoupanca.depositar(10D);
        contaPoupanca.mostrarDados();

        contaPoupanca.sacar(12D);
        contaPoupanca.mostrarDados();

        contaPoupanca.depositar(100D);
        contaPoupanca.mostrarDados();

        contaPoupanca.depositar(10D);
        contaPoupanca.mostrarDados();
        
        contaPoupanca.sacar(117D);
        contaPoupanca.mostrarDados();
    }
}
