package com.devBootCamp.polimorfismo1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var animais = new ArrayList<Animal>();
        animais.add(new Cachorro());
        animais.add(new Cavalo());
        animais.add(new Gato());

        var zoologico = new Zoologico(animais);
        zoologico.caracteristicasDosAnimais();
    }
}
