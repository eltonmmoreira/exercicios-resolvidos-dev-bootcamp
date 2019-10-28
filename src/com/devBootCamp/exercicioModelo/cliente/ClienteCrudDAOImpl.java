package com.devBootCamp.exercicioModelo.cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteCrudDAOImpl implements ClienteCrudDAO {

    @Override
    public Cliente salvar(Cliente cliente) {
        System.out.println("[JPA] - Registro Inserido com Sucesso!");
        return cliente;
    }

    @Override
    public List<Cliente> findAll() {
        System.out.println("[JPA] - Registros retornados");
        var clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("CLIENTE 1"));
        clientes.add(new Cliente("CLIENTE 2"));
        clientes.add(new Cliente("CLIENTE 3"));
        return clientes;
    }
}
