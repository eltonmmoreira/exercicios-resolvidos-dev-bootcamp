package com.devBootCamp.exercicio15;

public class PedidoItem {
    private Integer id;
    private Pedido pedido;
    private Item item;
    private Double quantidade;
    private Double valorUnitario;
    private Double valorDesconto;
    private Double valorTotal;

    public PedidoItem(Pedido pedido, Item item, Double quantidade, Double valorUnitario) {
        this.pedido = pedido;
        this.item = item;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Item getItem() {
        return item;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
}
