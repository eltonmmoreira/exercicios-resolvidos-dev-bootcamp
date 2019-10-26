package com.devBootCamp.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class GrupoPessoa {
    private List<Pessoa> pessoas = new ArrayList<>();

    public boolean adicionarPessoa(Pessoa pessoa) {
        if (ehMaiorDeIdade(pessoa)) {
            return pessoas.add(pessoa);
        }
        return false;
    }

    public Pessoa getPessoa(int index) {
        return pessoas.get(index);
    }

    private boolean ehMaiorDeIdade(Pessoa pessoa) {
//        var now = LocalDate.now();
//        long idade = ChronoUnit.YEARS.between(pessoa.getDataDeNascimento(), now);
        //int anos = now.getYear() - pessoa.getDataDeNascimento().getYear();
        return pessoa.getIdade() >= 18;
    }

    public Pessoa getPessoaComMenorIdade() {
        Integer menorIdade = 0;
        Pessoa pessoaComMenorIdade = null;
        for (Pessoa pessoa : pessoas) {
            Integer idade = pessoa.getIdade();
            if (idade < menorIdade || menorIdade == 0) {
                menorIdade = idade;
                pessoaComMenorIdade = pessoa;
            }
        }
        return pessoaComMenorIdade;
    }

    public Pessoa getPessoaComMaiorIdade() {
        Integer maiorIdade = 0;
        Pessoa pessoaComMaiorIdade = null;
        for (Pessoa pessoa : pessoas) {
            Integer idade = pessoa.getIdade();
            if (idade > maiorIdade || maiorIdade == 0) {
                maiorIdade = idade;
                pessoaComMaiorIdade = pessoa;
            }
        }
        return pessoaComMaiorIdade;
    }
}
