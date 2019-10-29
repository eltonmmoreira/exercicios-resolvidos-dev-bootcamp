package com.devBootCamp.exercicio15;

public class Item implements BaseObject {
    private Integer id;
    private String descricao;
    private Boolean inativo;
    private Double quantidadeEmEstoque;
    private Double valorUnitario;

    public Item(String descricao, Double quantidadeEmEstoque) {
        this.descricao = descricao;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getInativo() {
        return inativo;
    }

    public void setInativo(Boolean inativo) {
        this.inativo = inativo;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
