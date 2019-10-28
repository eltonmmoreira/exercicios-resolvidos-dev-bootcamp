package com.devBootCamp.exercicio14;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Voo {
    private Integer numeroVoo;
    private LocalDate data;
    private LocalTime hora;
    private Integer numeroMaximoDeAssentos;
    private List<Integer> assentosOcupados = new ArrayList<>();
    private List<Integer> assentosLivres;

    public Voo(Integer numeroVoo, LocalDate data, LocalTime hora) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.hora = hora;
        numeroMaximoDeAssentos = 100;
        assentosLivres = new ArrayList<>(numeroMaximoDeAssentos);
        for (int i = 1; i <= numeroMaximoDeAssentos; i++) {
            assentosLivres.add(i);
        }
    }

    public Integer getNumeroVoo() {
        return numeroVoo;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Integer getNumeroMaximoDeAssentos() {
        return numeroMaximoDeAssentos;
    }

    public List<Integer> getAssentosOcupados() {
        return assentosOcupados;
    }

    public Integer primeiroLivre() {
        if (assentosLivres.isEmpty()) {
            System.out.println("Nenhum assento livre");
            return null;
        }
        assentosLivres.sort(Comparator.comparing(Integer::intValue));
        return assentosLivres.get(0);
    }

    public Integer proximoAssentoLivre(Integer numeroAssento) {
        if (assentosLivres.isEmpty()) {
            System.out.println("Nenhum assento livre");
            return null;
        }

        assentosLivres.sort(Comparator.comparing(Integer::intValue));
        for (Integer assento : assentosLivres) {
            if (assento > numeroAssento) {
                return assento;
            }
        }

//        return assentosLivres.stream().filter(a -> a > numeroAssento)
//                .findFirst()
//                .orElse(null);
        return null;
    }

    public boolean verificaSeEstaOcupado(Integer numeroAssento) {
        for (Integer assento : assentosOcupados) {
            if (numeroAssento.equals(assento)) {
                return true;
            }
        }
        return false;
    }

    public boolean ocuparAssento(Integer numeroAssento) {
        if (!verificaSeEstaOcupado(numeroAssento)) {
            assentosLivres.remove(numeroAssento);
            return assentosOcupados.add(numeroAssento);
        }
        return false;
    }

    public Integer quantidadeAssentosLivres() {
        return numeroMaximoDeAssentos - assentosOcupados.size();
    }

    public List<Integer> getAssentosLivres() {
        var assentosLivres = new ArrayList<Integer>();
        for (int i = 1; i < numeroMaximoDeAssentos; i++) {
            if (!assentosOcupados.contains(i)) {
                assentosLivres.add(i);
            }
        }
        return assentosLivres;
        //return this.assentosLivres;
    }

    public Voo clone() {
        var clone = new Voo(this.numeroVoo, this.data, this.hora);
        clone.numeroMaximoDeAssentos = this.numeroMaximoDeAssentos;
        clone.assentosLivres = this.assentosLivres;
        clone.assentosOcupados = this.assentosOcupados;
        return clone;
    }
}
