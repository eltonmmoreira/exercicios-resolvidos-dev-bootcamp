package com.devBootCamp.exercicioModelo.pedido;

import com.devBootCamp.exercicioModelo.cliente.Cliente;
import com.devBootCamp.exercicioModelo.item.Item;
import com.devBootCamp.exercicioModelo.vendedor.Vendedor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoCrudDAOImpl implements PedidoCrudDAO {

    @Override
    public Pedido salvar(Pedido pedido) {
        System.out.println("[JPA] - Registro Inserido com Sucesso!");
        return pedido;
    }

    @Override
    public List<Pedido> findAll() {
        System.out.println("[JPA] - Registros retornados");

        var pedidos = new ArrayList<Pedido>();
        var pedido = new Pedido(new Cliente("CLIENTE 1"), new Vendedor("VENDEDOR"), LocalDateTime.now());
        var celular = new Item("CELULAR", 10D);
        var notebook = new Item("MACKBOOK", 2D);
        var celularPedido = new PedidoItem(pedido, celular, 5D, 150.50);
        var notebookPedido = new PedidoItem(pedido, notebook, 1D, 3550.50);

        pedido.adicionarItem(celularPedido);
        pedido.adicionarItem(notebookPedido);
        pedidos.add(pedido);

        return pedidos;
    }
}
