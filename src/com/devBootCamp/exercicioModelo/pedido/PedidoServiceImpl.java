package com.devBootCamp.exercicioModelo.pedido;

import com.devBootCamp.exercicioModelo.email.Email;
import com.devBootCamp.exercicioModelo.email.EmailService;
import com.devBootCamp.exercicioModelo.email.EmailServiceImpl;

import java.util.List;

public class PedidoServiceImpl implements PedidoService {

    private PedidoCrudDAO pedidoCrudDAO = new PedidoCrudDAOImpl();

    private EmailService emailService = new EmailServiceImpl();

    @Override
    public Pedido salvar(Pedido pedido) {
        validarAntesDeSalvar(pedido);

        pedido = pedidoCrudDAO.salvar(pedido);

        emailService.enviarEmail(new Email("viasoft.com.br", "cliente@teste.com"));
        return pedido;
    }

    @Override
    public List<Pedido> findAll() {
        return pedidoCrudDAO.findAll();
    }

    private void validarAntesDeSalvar(Pedido pedido) {
        if (pedido.getFormaDePagamento() == null) {
            throw new RuntimeException("Forma de pagamento não informada!");
        }
    }
}
