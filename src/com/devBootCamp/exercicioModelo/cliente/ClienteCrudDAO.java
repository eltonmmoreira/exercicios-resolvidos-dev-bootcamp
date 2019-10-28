package com.devBootCamp.exercicioModelo.cliente;

import java.util.List;

public interface ClienteCrudDAO {

    Cliente salvar(Cliente cliente);

    List<Cliente> findAll();

}
