package com.devBootCamp.polimorfismo1;

public class Gato implements Animal {

    @Override
    public String somDoAnimal() {
        return "MIAU";
    }

    @Override
    public String corDoAnimal() {
        return "Branco";
    }

    @Override
    public String nomeDoAnimal() {
        return "Gato";
    }
}
