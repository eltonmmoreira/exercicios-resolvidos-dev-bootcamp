package com.devBootCamp.exercicio14;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var voo = new Voo(123, LocalDate.now(), LocalTime.of(23, 0));

        loggerAssentosLivresEOcupados(voo);

        loggerOcupado(voo, 10);

        loggerOcuparAssento(voo, 15);
        loggerOcupado(voo, 15);
        loggerAssentosLivresEOcupados(voo);

        loggerOcuparAssento(voo, 18);
        loggerOcupado(voo, 18);
        loggerAssentosLivresEOcupados(voo);

        loggerOcuparAssento(voo, 34);
        loggerOcupado(voo, 34);
        loggerAssentosLivresEOcupados(voo);

        loggerOcupado(voo, 34);

        loggerOcuparAssento(voo, 1);
        loggerOcupado(voo, 1);
        loggerAssentosLivresEOcupados(voo);

        var primeiroLivre = voo.primeiroLivre();
        System.out.println("Primeiro livre: " +  primeiroLivre);

        var proximoLivre = voo.proximoAssentoLivre(33);
        System.out.println("Próximo assento livre: " + proximoLivre);
        loggerAssentosLivresEOcupados(voo);

        var voo2 = voo.clone();
        System.out.println(voo2);
    }

    private static void loggerOcuparAssento(Voo voo, Integer assento) {
        var ocupado = voo.ocuparAssento(assento);
        System.out.println("Ocupar Assento: " + assento + " - " + ocupado);
    }

    private static void loggerOcupado(Voo voo, Integer assento) {
        var ocupado = voo.verificaSeEstaOcupado(assento);
        System.out.println("Assento Ocupado: " + assento + " - " + ocupado);
    }

    private static void loggerAssentosLivresEOcupados(Voo voo) {
        System.out.println("Quantidade assentos livre: " + voo.quantidadeAssentosLivres());
        System.out.println("Assentos livre: "
                + voo.getAssentosLivres().stream().map(Object::toString).collect(Collectors.joining("-")));
        System.out.println("Quantidade assentos ocupados: " + voo.getAssentosOcupados().size());
        System.out.println("Assentos ocupados: "
                + voo.getAssentosOcupados().stream().map(Object::toString).collect(Collectors.joining("-")));
        System.out.println();
    }
}
