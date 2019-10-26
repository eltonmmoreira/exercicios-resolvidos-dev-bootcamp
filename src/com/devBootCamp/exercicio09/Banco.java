package com.devBootCamp.exercicio09;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contaBancariaList = new ArrayList<>();

    public boolean inserir(ContaBancaria contaBancaria) {
        var conta = procurar(contaBancaria.numeroConta);

        if (conta != null) {
            System.out.println("Conta " + conta.numeroConta + " já adicionada");
            return false;
        }
        return contaBancariaList.add(contaBancaria);
    }

    public boolean remover(ContaBancaria contaBancaria) {
        return contaBancariaList.remove(contaBancaria);
    }

    public ContaBancaria procurar(Integer numeroConta) {
        for (ContaBancaria contaBancaria : contaBancariaList) {
            if (contaBancaria.numeroConta.equals(numeroConta)) {
                return contaBancaria;
            }
        }
        return null;
    }
}
