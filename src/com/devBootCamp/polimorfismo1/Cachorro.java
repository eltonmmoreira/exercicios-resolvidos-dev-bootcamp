package com.devBootCamp.polimorfismo1;

public class Cachorro implements Animal {

    @Override
    public String somDoAnimal() {
        return "AUAU";
    }

    @Override
    public String corDoAnimal() {
        return "Preto";
    }

    @Override
    public String nomeDoAnimal() {
        return "Cavalo";
    }
}
