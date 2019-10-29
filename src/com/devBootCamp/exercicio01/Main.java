package com.devBootCamp.exercicio01;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        var pessoa = new Pessoa();
        pessoa.setNome("Elton");
        pessoa.setSobrenome("M. Moreira");
        pessoa.setCpf("12123123123");
        pessoa.setDataDeNascimento(LocalDate.of(1987, Month.JUNE, 13));
        pessoa.getEnderecos().add(new Endereco("Rua Teste", "123", "Teste"));
        pessoa.getEnderecos().add(new Endereco("Rua Teste2", "SN", "Teste"));
        pessoa.getTelefones().add(new Telefone("46 2131231", TipoTelefone.RESIDENCIAL));
        pessoa.getTelefones().add(new Telefone("46 99923123129", TipoTelefone.CELULAR));
        pessoa.dadosDaPessoa();

        var p = new Pessoa();
        p.setCpf("1");

        var p2 = new Pessoa();
        p2.setCpf("1");

        System.out.println(p.equals(p2));
    }
}
