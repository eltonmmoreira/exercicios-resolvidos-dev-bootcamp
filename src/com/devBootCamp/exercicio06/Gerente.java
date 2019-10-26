package com.devBootCamp.exercicio06;

import com.devBootCamp.exercicio04.Empregado;
import com.devBootCamp.exercicio05.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado {
    private Double ajudaDeCusto;
    private Double percentualDeComissao;
    private List<Vendedor> vendedores = new ArrayList<>();

    public Gerente(String nome, String cpf, Double salarioBase, Double impostos, Double ajudaDeCusto, Double percentualDeComissao, List<Vendedor> vendedores) {
        super(nome, cpf, salarioBase, impostos);
        this.ajudaDeCusto = ajudaDeCusto;
        this.percentualDeComissao = percentualDeComissao;
        this.vendedores = vendedores;
    }

    public Double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(Double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public Double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(Double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    @Override
    public Double calcularSalario() {
        var totalDeProdutos = 0D;
        for (Vendedor vendedor : vendedores) {
            totalDeProdutos += vendedor.getValorProdutosVendidos();
        }

        var valorComissao = (totalDeProdutos * percentualDeComissao) / 100;
        return (salarioBase + valorComissao) - impostos;
    }
}
