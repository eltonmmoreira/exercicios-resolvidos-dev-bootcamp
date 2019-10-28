package com.devBootCamp.exercicio15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    private List<PedidoItem> itens = new ArrayList<>();

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

    public List<PedidoItem> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }

    public void resumo() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Data de cadastro: " + dataDeCadastro);
        System.out.println("Data Previsão de Entrega: " + dataPrevisaoDeEntrega);
        System.out.println("Data de validade: " + dataDeValidade);
        System.out.println("Endereço de Entrega: " + enderecoDeEntrega);
        System.out.println("Observação: " + observacao);
        System.out.println("Forma de pagamento: " + formaDePagamento.getLabel());
        System.out.println();

        var valorTotal = 0D;
        for (PedidoItem item : itens) {
            System.out.println("Produto: " + item.getItem().getDescricao());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Valor Unitário: " + item.getValorUnitario());
            System.out.println("Valor Desconto: " + item.getValorDesconto());
            System.out.println("Valor Total: " + item.getValorTotal());
            if (item.getValorTotal() != null) {
                valorTotal += item.getValorTotal();
            }
            System.out.println();
        }
        System.out.println("Total Pedido: " + valorTotal);
    }
}
