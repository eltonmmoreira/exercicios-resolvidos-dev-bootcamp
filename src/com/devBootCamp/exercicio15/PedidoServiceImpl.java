package com.devBootCamp.exercicio15;

import com.devBootCamp.exercicio15.crud.CrudDAO;
import com.devBootCamp.exercicio15.crud.CrudDAOImpl;
import com.devBootCamp.exercicio15.crud.CrudServiceImpl;

public class PedidoServiceImpl extends CrudServiceImpl<Pedido> implements PedidoService {

    private CrudDAO<Pedido> dao = new CrudDAOImpl<>();

    @Override
    protected CrudDAO<Pedido> getCrudDAO() {
        return dao;
    }
}
