package com.devBootCamp.exercicio01;

public class Telefone {
    private String numero;
    private TipoTelefone tipoTelefone;

    public Telefone(String numero, TipoTelefone tipoTelefone) {
        this.numero = numero;
        this.tipoTelefone = tipoTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }
}
