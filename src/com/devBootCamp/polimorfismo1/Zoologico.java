package com.devBootCamp.polimorfismo1;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais = new ArrayList<>();

    public Zoologico(List<Animal> animais) {
        this.animais = animais;
    }

    public void caracteristicasDosAnimais() {
        for (Animal animal : animais) {
            System.out.println("Animal: " + animal.nomeDoAnimal());
            System.out.println("Som Do Animal: " + animal.somDoAnimal());
            System.out.println("Cor Do Animal: " + animal.corDoAnimal());
            System.out.println("****************************************");
        }
    }
}
