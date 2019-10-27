package com.devBootCamp.exercicio11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var animais = new ArrayList<Animal>();
        animais.add(new Aguia());
        animais.add(new Cachorro());
        animais.add(new Cachorro());
        animais.add(new Cachorro());
        animais.add(new Lambari());
        animais.add(new Lambari());
        animais.add(new Jacare());
        animais.add(new Gato());

        var contabilizar = new ContabilizarEspecies();
        var animaisPorEspecie = contabilizar.contabilizarEspecies(animais, new EspecieUtilImpl());

        for (Resultado resultado : animaisPorEspecie) {
            System.out.println("Espécie: " + resultado.getEspecieAnimal().getLabel());
            System.out.println("Quantidade: " + resultado.getQuantidade());
        }
    }
}
