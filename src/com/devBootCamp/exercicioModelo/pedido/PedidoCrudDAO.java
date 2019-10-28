package com.devBootCamp.exercicioModelo.pedido;

import java.util.List;

public interface PedidoCrudDAO {

    Pedido salvar(Pedido pedido);

    List<Pedido> findAll();
}
