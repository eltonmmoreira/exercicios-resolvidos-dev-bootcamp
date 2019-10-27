package com.devBootCamp.exercicio11;

public class Resultado {
    private EspecieAnimal especieAnimal;
    private Integer quantidade;

    public Resultado(EspecieAnimal especieAnimal, Integer quantidade) {
        this.especieAnimal = especieAnimal;
        this.quantidade = quantidade;
    }

    public EspecieAnimal getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(EspecieAnimal especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
