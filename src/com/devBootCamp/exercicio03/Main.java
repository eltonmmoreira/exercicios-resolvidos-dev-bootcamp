package com.devBootCamp.exercicio03;

public class Main {

    public static void main(String[] args) {
        var gerenciadorDeEmprestimos = new GerenciadorDeEmprestimos();

        gerenciadorDeEmprestimos.emprestar(new Livro(1, "Senhor dos Anéis", "J. R. R. Tolkien"),
                new Aluno("Elton"));
        gerenciadorDeEmprestimos.emprestar(new Livro(2, "A cabana", "William P. Young"),
                new Aluno("Pedro"));
        gerenciadorDeEmprestimos.emprestar(new Livro(3, "Uma Breve História do Tempo", "Stephen Hawkingn"),
                new Aluno("Paulo"));
        gerenciadorDeEmprestimos.emprestar(new Livro(4, "Moneyball: O Homem que Mudou o Jogo", "Michael Lewis"),
                new Aluno("Elton"));
        gerenciadorDeEmprestimos.emprestar(new Livro(4, "Moneyball: O Homem que Mudou o Jogo", "Michael Lewis"),
                new Aluno("Maria"));

        System.out.println(gerenciadorDeEmprestimos.getHistoricoDeEmprestimos());
        System.out.println();
        System.out.println("Livro com mais empréstimo e tentativas de empréstimo");
        var tentativa = gerenciadorDeEmprestimos.livroComMaisTentativasEEmprestimos();
        System.out.println(tentativa.getLivro().getTitulo());
        System.out.println(tentativa.getQuantidade());
    }
}
