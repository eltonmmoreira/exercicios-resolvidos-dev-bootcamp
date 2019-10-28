package com.devBootCamp.exercicio15;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedido {
    private Integer id;
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDateTime dataDeCadastro;
    private LocalDate dataPrevisaoDeEntrega;
    private LocalDate dataDeValidade;
    private Endereco enderecoDeEntrega;
    private String observacao;
    private FormaDePagamento formaDePagamento;

    public Pedido(Cliente cliente, Vendedor vendedor, LocalDateTime dataDeCadastro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataDeCadastro = dataDeCadastro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataPrevisaoDeEntrega() {
        return dataPrevisaoDeEntrega;
    }

    public void setDataPrevisaoDeEntrega(LocalDate dataPrevisaoDeEntrega) {
        this.dataPrevisaoDeEntrega = dataPrevisaoDeEntrega;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public Endereco getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }
}
