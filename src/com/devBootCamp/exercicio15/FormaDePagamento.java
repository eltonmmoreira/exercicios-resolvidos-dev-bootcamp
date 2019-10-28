package com.devBootCamp.exercicio15;

public enum FormaDePagamento {
    DINHEIRO("Dinheiro"),
    CARTAO("Cartão"),
    BOLETO("Boleto");

    private String label;

    FormaDePagamento(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
