package com.devBootCamp.exercicio04;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        var empregado = new Empregado("Elton", "11111111111", 1250.69, 100D);
        System.out.println("Empregado: ");
        System.out.println(empregado.getNome());
        System.out.println("Salário: ");
        System.out.println(new DecimalFormat("#,##0.00").format(empregado.calcularSalario()));
    }
}
