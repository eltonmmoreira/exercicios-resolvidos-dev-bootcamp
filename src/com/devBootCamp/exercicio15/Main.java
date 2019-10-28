package com.devBootCamp.exercicio15;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        PedidoService pedidoService = new PedidoServiceImpl();

        var cliente = new Cliente("Elton");
        var vendedor = new Vendedor("João");
        vendedor.setPercentualDeComissao(10D);
        vendedor.setPercentualDeDescontoMaximo(5D);

        var pedido = new Pedido(cliente, vendedor, LocalDateTime.now());
        pedido.setFormaDePagamento(FormaDePagamento.CARTAO);

        var celular = new Item("Celular", 2D);
        var notebook = new Item("Macbook", 5D);

        var pedidoItemCelular = new PedidoItem(pedido, celular, 1D, 1000D);
        var pedidoItemNotebook = new PedidoItem(pedido, notebook, 2D, 5000D);
        pedidoItemNotebook.setValorDesconto(100D);

        pedido.getItens().add(pedidoItemCelular);
        pedido.getItens().add(pedidoItemNotebook);

        var pedidoGravado = pedidoService.salvar(pedido);
        pedidoGravado.resumo();

    }
}
