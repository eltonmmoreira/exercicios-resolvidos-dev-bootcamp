package com.devBootCamp.exercicio02;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        var pessoaGrupo = new GrupoPessoa();

        pessoaGrupo.adicionarPessoa(new Pessoa("Elton", "12312312312", LocalDate.of(1987, Month.JUNE, 13)));
        pessoaGrupo.adicionarPessoa(new Pessoa("João", "111111111111", LocalDate.of(1995, Month.APRIL, 5)));
        pessoaGrupo.adicionarPessoa(new Pessoa("Maria", "22222222222", LocalDate.of(2003, Month.JANUARY, 15)));
        pessoaGrupo.adicionarPessoa(new Pessoa("Paulo", "33333333333", LocalDate.of(1980, Month.APRIL, 20)));
        pessoaGrupo.adicionarPessoa(new Pessoa("Pedro", "44444444444", LocalDate.of(2001, Month.OCTOBER, 22)));

        var pessoaComMenorIdade = pessoaGrupo.getPessoaComMenorIdade();
        System.out.println("Menor Idade: ");
        System.out.println("Nome: " + pessoaComMenorIdade.getNome() + "\nIdade: " + pessoaComMenorIdade.getIdade());
        System.out.println();

        var pessoaComMaiorIdade = pessoaGrupo.getPessoaComMaiorIdade();
        System.out.println("Maior Idade: ");
        System.out.println("Nome: " + pessoaComMaiorIdade.getNome() + "\nIdade: " + pessoaComMaiorIdade.getIdade());
    }
}
