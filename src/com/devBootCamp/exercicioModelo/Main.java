package com.devBootCamp.exercicioModelo;

import com.devBootCamp.exercicioModelo.cliente.Cliente;
import com.devBootCamp.exercicioModelo.item.Item;
import com.devBootCamp.exercicioModelo.pedido.*;
import com.devBootCamp.exercicioModelo.vendedor.Vendedor;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        PedidoService pedidoService = new PedidoServiceImpl();

        var cliente = new Cliente("Elton");
        var vendedor = new Vendedor("João");
        vendedor.setEmail("vendedor@email.com");
        vendedor.setPercentualDeComissao(10D);
        vendedor.setPercentualDeDescontoMaximo(5D);

        var pedido = new Pedido(cliente, vendedor, LocalDateTime.now());
        pedido.setFormaDePagamento(FormaDePagamento.CARTAO);

        var celular = new Item("Celular", 2D);
        var notebook = new Item("Macbook", 1D);

        var pedidoItemCelular = new PedidoItem(pedido, celular, 1D, 1000D);
        var pedidoItemNotebook = new PedidoItem(pedido, notebook, 2D, 5000D);
        pedidoItemNotebook.setValorDesconto(100D);

        pedido.adicionarItem(pedidoItemCelular);
        pedido.adicionarItem(pedidoItemNotebook);

        var pedidoGravado = pedidoService.salvar(pedido);
        System.out.println(pedidoGravado.getResumo());

    }
}
