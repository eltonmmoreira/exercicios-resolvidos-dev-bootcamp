package com.devBootCamp.exercicio11;

public class Jacare implements Animal {

    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.REPTEIS;
    }

    @Override
    public String getNomeAnimal() {
        return "Jacaré";
    }
}
