package com.devBootCamp.exercicio13;

public class Main {

    public static void main(String[] args) {
        var elevador = new Elevador(5, 3);

        elevador.descer();
        elevador.subir();
        System.out.println("Andar: " + elevador.getAndarAtual());
        System.out.println("Quantidade de Pessoas: " + elevador.getQuantidadePessoas());
        elevador.entrar();
        System.out.println("Andar: " + elevador.getAndarAtual());
        System.out.println("Quantidade de Pessoas: " + elevador.getQuantidadePessoas());
        elevador.entrar();
        System.out.println("Andar: " + elevador.getAndarAtual());
        System.out.println("Quantidade de Pessoas: " + elevador.getQuantidadePessoas());
        elevador.subir();
        System.out.println("Andar: " + elevador.getAndarAtual());
        System.out.println("Quantidade de Pessoas: " + elevador.getQuantidadePessoas());
        elevador.entrar();
        System.out.println("Andar: " + elevador.getAndarAtual());
        System.out.println("Quantidade de Pessoas: " + elevador.getQuantidadePessoas());
        elevador.descer();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.entrar();
        System.out.println("Andar: " + elevador.getAndarAtual());
        System.out.println("Quantidade de Pessoas: " + elevador.getQuantidadePessoas());
        elevador.sair();
        elevador.sair();
        elevador.sair();
        System.out.println("Andar: " + elevador.getAndarAtual());
        System.out.println("Quantidade de Pessoas: " + elevador.getQuantidadePessoas());
    }
}
