package com.devBootCamp.exercicio05;

import com.devBootCamp.exercicio04.Empregado;

public class Vendedor extends Empregado {
    private Double valorProdutosVendidos;
    private Double percentualDeComissao;

    public Vendedor(String nome, String cpf, Double salarioBase, Double impostos, Double valorProdutosVendidos, Double percentualDeComissao) {
        super(nome, cpf, salarioBase, impostos);
        this.valorProdutosVendidos = valorProdutosVendidos;
        this.percentualDeComissao = percentualDeComissao;
    }

    public Double getValorProdutosVendidos() {
        return valorProdutosVendidos;
    }

    public void setValorProdutosVendidos(Double valorProdutosVendidos) {
        this.valorProdutosVendidos = valorProdutosVendidos;
    }

    public Double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(Double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    @Override
    public Double calcularSalario() {
        var valorComissao = (valorProdutosVendidos * percentualDeComissao) / 100;
        return (salarioBase + valorComissao) - impostos;
    }
}
