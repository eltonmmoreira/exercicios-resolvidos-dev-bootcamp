package com.devBootCamp.exercicioModelo.cliente;

import java.util.List;

public interface ClienteService {

    Cliente salvar(Cliente cliente);

    List<Cliente> findAll();
}
