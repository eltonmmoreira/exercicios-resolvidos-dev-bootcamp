package com.devBootCamp.exercicioModelo.pedido;

import java.util.List;

public interface PedidoService {

    Pedido salvar(Pedido pedido);

    List<Pedido> findAll();
}
