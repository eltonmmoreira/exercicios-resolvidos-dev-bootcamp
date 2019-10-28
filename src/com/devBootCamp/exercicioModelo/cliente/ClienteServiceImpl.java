package com.devBootCamp.exercicioModelo.cliente;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private ClienteCrudDAO clienteCrudDAO = new ClienteCrudDAOImpl();

    @Override
    public Cliente salvar(Cliente cliente) {
        return clienteCrudDAO.salvar(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteCrudDAO.findAll();
    }
}
