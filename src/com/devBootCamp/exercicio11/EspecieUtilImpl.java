package com.devBootCamp.exercicio11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EspecieUtilImpl implements EspeciesUtil {

    @Override
    public List<Animal> filtraEspecie(List<Animal> animais, EspecieAnimal especieFiltrar) {
        var animaisDaEspecie = new ArrayList<Animal>();
        for (Animal animal : animais) {
            if (especieFiltrar.equals(animal.getEspecie())) {
                animaisDaEspecie.add(animal);
            }
        }
        return animaisDaEspecie;
    }

    @Override
    public List<EspecieAnimal> classificaEspecies(List<Animal> animais) {
//        var especies = new HashSet<EspecieAnimal>();
//        for (Animal animal : animais) {
//            especies.add(animal.getEspecie());
//        }
//        return new ArrayList<>(especies);

        var especies = new ArrayList<EspecieAnimal>();
        for (Animal animal : animais) {
            if (!especies.contains(animal.getEspecie())) {
                especies.add(animal.getEspecie());
            }
        }
        return especies;
    }
}
