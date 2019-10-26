package com.devBootCamp.exercicio10;

public class Circulo implements Figura {
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        return Math.PI * (raio * raio);
    }
}
