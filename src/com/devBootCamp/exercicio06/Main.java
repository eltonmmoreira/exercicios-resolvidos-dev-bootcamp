package com.devBootCamp.exercicio06;

import com.devBootCamp.exercicio05.Vendedor;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var vendedores = new ArrayList<Vendedor>();
        vendedores.add(new Vendedor("Pedro", "222222222222", 1000D, 100D, 2000D, 10D));
        vendedores.add(new Vendedor("Maria", "333333333333", 2000D, 300D, 5000D, 10D));

        var gerente = new Gerente("Elton", "11111111111", 1250.50, 100D, 500D, 20D, vendedores);

        var formatter = new DecimalFormat("#,##0.00");
        System.out.println("Gerente: ");
        System.out.println(gerente.getNome());
        System.out.println("Salário Base: ");
        System.out.println(formatter.format(gerente.getSalarioBase()));
        System.out.println("Valor Ajuda de Custo: ");
        System.out.println(formatter.format(gerente.getAjudaDeCusto()));
        System.out.println("Percentual de comissão: ");
        System.out.println(gerente.getPercentualDeComissao());
        System.out.println("Impostos: ");
        System.out.println(gerente.getImpostos());
        System.out.println("Total a Receber: Salário Base + Comissão - Impostos");
        System.out.println(formatter.format(gerente.calcularSalario()));
    }
}
