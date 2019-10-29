package com.devBootCamp.exercicio01;

public enum TipoTelefone {
    COMERCIAL("Comercial"),
    RESIDENCIAL("Residêncial"),
    CELULAR("Celular");

    private String label;

    TipoTelefone(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
