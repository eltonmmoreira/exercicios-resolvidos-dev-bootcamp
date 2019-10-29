package com.devBootCamp.exercicioModelo.cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClienteCrudDAOMemoryImpl implements ClienteCrudDAO {

    private static List<Cliente> CLIENTES = new ArrayList<>();
    private Random random = new Random();

    @Override
    public Cliente salvar(Cliente cliente) {
        if (cliente.getId() == null) {
            cliente.setId(random.nextInt());
        }
        CLIENTES.add(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> findAll() {
        return CLIENTES;
    }
}
