package com.devBootCamp.exercicio15;

public class Vendedor {
    private Integer id;
    private String nome;
    private Double percentualDeComissao;
    private Double percentualDeDescontoMaximo;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(Double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    public Double getPercentualDeDescontoMaximo() {
        return percentualDeDescontoMaximo;
    }

    public void setPercentualDeDescontoMaximo(Double percentualDeDescontoMaximo) {
        this.percentualDeDescontoMaximo = percentualDeDescontoMaximo;
    }

    public String getNome() {
        return nome;
    }
}
