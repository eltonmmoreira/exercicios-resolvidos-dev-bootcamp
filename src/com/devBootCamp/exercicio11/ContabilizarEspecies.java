package com.devBootCamp.exercicio11;

import java.util.ArrayList;
import java.util.List;

public class ContabilizarEspecies {

    public List<Resultado> contabilizarEspecies(List<Animal> animais, EspeciesUtil especiesUtil) {
        var resultados = new ArrayList<Resultado>();
        var especies = especiesUtil.classificaEspecies(animais);
        for (EspecieAnimal especie : especies) {
            var animaisDaEspecie = especiesUtil.filtraEspecie(animais, especie);
            resultados.add(new Resultado(especie, animaisDaEspecie.size()));
        }
        return resultados;
    }
}
