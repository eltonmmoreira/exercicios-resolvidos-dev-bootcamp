package com.devBootCamp.exercicio09;

public class Main {

    public static void main(String[] args) {
        var banco = new Banco();
        banco.inserir(new ContaCorrente(123, 10D));
        banco.inserir(new ContaCorrente(312, 2D));
        banco.inserir(new ContaCorrente(123, 10D));
        banco.inserir(new ContaPoupanca(11, 100D));

        var conta = banco.procurar(123);
        System.out.println("Conta " + conta.numeroConta + " encontrada");
        System.out.println("Saldo " + conta.saldo);

        banco.remover(new ContaCorrente(123, 10D));
        var contaNaoEncontrada = banco.procurar(123);
        if (contaNaoEncontrada == null) {
            System.out.println("Conta " +  123 + " Não encontrada");
        } else{
            System.out.println(contaNaoEncontrada.numeroConta);
        }
    }
}
