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
        System.out.println(pessoa.getNomeFormatado());
    }
}
