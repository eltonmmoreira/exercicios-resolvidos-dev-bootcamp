package com.devBootCamp.exercicioModelo;

import com.devBootCamp.exercicioModelo.cliente.Cliente;
import com.devBootCamp.exercicioModelo.cliente.ClienteService;
import com.devBootCamp.exercicioModelo.cliente.ClienteServiceImpl;
import com.devBootCamp.exercicioModelo.item.Item;
import com.devBootCamp.exercicioModelo.item.ItemService;
import com.devBootCamp.exercicioModelo.item.ItemServiceImpl;
import com.devBootCamp.exercicioModelo.pedido.Pedido;
import com.devBootCamp.exercicioModelo.pedido.PedidoItem;
import com.devBootCamp.exercicioModelo.pedido.PedidoService;
import com.devBootCamp.exercicioModelo.pedido.PedidoServiceImpl;
import com.devBootCamp.exercicioModelo.vendedor.Vendedor;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        //Cliente
        ClienteService clienteService = new ClienteServiceImpl();
        var cliente = new Cliente("teste");
        var clienteInserido = clienteService.salvar(cliente);
        System.out.println(clienteInserido.getNome());

        var clientes = clienteService.findAll();
        for (Cliente c : clientes) {
            System.out.println(c.getNome());
        }

        System.out.println();

        //Item
        ItemService itemService = new ItemServiceImpl();
        var item = new Item("ITEM_TESTE", 15D);
        var itemInserido = itemService.salvar(item);
        System.out.println(itemInserido.getDescricao());

        var itens = itemService.findAll();
        for (Item i : itens) {
            System.out.println(i.getDescricao());
        }

        System.out.println();

        PedidoService pedidoService = new PedidoServiceImpl();

        var pedido = new Pedido(new Cliente("CLIENTE 1"), new Vendedor("VENDEDOR 1"), LocalDateTime.now());
        var celular = new Item("CELULAR 1", 10D);
        var notebook = new Item("MACKBOOK 1", 2D);
        var celularPedido = new PedidoItem(pedido, celular, 5D, 150.50);
        var notebookPedido = new PedidoItem(pedido, notebook, 1D, 3550.50);

        pedido.adicionarItem(celularPedido);
        pedido.adicionarItem(notebookPedido);
        var pedidoInserido = pedidoService.salvar(pedido);
        System.out.println(pedidoInserido.getResumo());

//        ClienteService clienteService = new ClienteServiceImpl();
//        var cliente = new Cliente("Elton");
//        clienteService.salvar(cliente);
//
//        var cliente2 = new Cliente("WEQRWQE");
//        clienteService.salvar(cliente2);
//
//        var cliente3 = new Cliente("rewqrew");
//        clienteService.salvar(cliente3);
//
//        var clientes = clienteService.findAll();
//        for (Cliente c : clientes) {
//            System.out.println(c.getId() + " - " + c.getNome());
//        }
    }
}
