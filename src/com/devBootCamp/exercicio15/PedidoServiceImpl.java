package com.devBootCamp.exercicio15;

import com.devBootCamp.exercicio15.crud.CrudDAO;
import com.devBootCamp.exercicio15.crud.CrudDAOImpl;
import com.devBootCamp.exercicio15.crud.CrudServiceImpl;

public class PedidoServiceImpl extends CrudServiceImpl<Pedido> implements PedidoService {

    private CrudDAO<Pedido> dao = new CrudDAOImpl<>();

    private EmailService emailService = new EmailServiceImpl();

    @Override
    protected CrudDAO<Pedido> getCrudDAO() {
        return dao;
    }

    @Override
    protected void postSave(Pedido entity) {
        super.postSave(entity);
        var email = new Email("elton@viasoft.com.br", "gaspar@viasoft.com.br");
        emailService.enviarEmail(email);
    }
}
