package com.devBootCamp.exercicio05;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        var vendedor = new Vendedor("Elton", "11111111111", 1250.50, 100D);
        vendedor.setValorProdutosVendidos(2000D);
        vendedor.setPercentualDeComissao(20D);
        var formatter = new DecimalFormat("#,##0.00");
        System.out.println("Vendedor: ");
        System.out.println(vendedor.getNome());
        System.out.println("Salário Base: ");
        System.out.println(formatter.format(vendedor.getSalarioBase()));
        System.out.println("Valor dos Produtos Vendidos: ");
        System.out.println(formatter.format(vendedor.getValorProdutosVendidos()));
        System.out.println("Percentual de comissão: ");
        System.out.println(vendedor.getPercentualDeComissao());
        System.out.println("Impostos: ");
        System.out.println(vendedor.getImpostos());
        System.out.println("Total a Receber: Salário Base + Comissão - Impostos");
        System.out.println(formatter.format(vendedor.calcularSalario()));
    }
}
