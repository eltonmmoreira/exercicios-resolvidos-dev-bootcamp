package com.devBootCamp.polimorfismo1;

public class Cavalo implements Animal {
    @Override
    public String somDoAnimal() {
        return "IRRRIINN";
    }

    @Override
    public String corDoAnimal() {
        return "Marrom";
    }

    @Override
    public String nomeDoAnimal() {
        return "Cavalo";
    }
}
