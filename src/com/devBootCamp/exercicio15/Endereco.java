package com.devBootCamp.exercicio15;

public class Endereco {
    private String endereco;
    private String numero;
    private String bairro;

    public Endereco(String endereco, String numero, String bairro) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }
}