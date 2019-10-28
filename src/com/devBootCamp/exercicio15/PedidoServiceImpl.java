package com.devBootCamp.exercicio15;

import com.devBootCamp.Util;
import com.devBootCamp.exercicio15.crud.CrudDAO;
import com.devBootCamp.exercicio15.crud.CrudDAOImpl;
import com.devBootCamp.exercicio15.crud.CrudServiceImpl;

import static com.devBootCamp.Util.formatarValor;

public class PedidoServiceImpl extends CrudServiceImpl<Pedido> implements PedidoService {

    private CrudDAO<Pedido> dao = new CrudDAOImpl<>();

    private EmailService emailService = new EmailServiceImpl();

    @Override
    protected CrudDAO<Pedido> getCrudDAO() {
        return dao;
    }

    @Override
    protected void preSave(Pedido entity) {
        super.preSave(entity);

        //1000(quantidade) * 10(percentual) / 100 = 100
        //1100

        //500(valor) / 1000(total) * 100 = 50
        if (entity.getVendedor().getPercentualDeDescontoMaximo() != null) {
            var valorTotalProdutos = 0D;
            var valorTotalDesconto = 0D;
            for (PedidoItem pedidoItem : entity.getItens()) {
                valorTotalProdutos += pedidoItem.getValorTotal();
                valorTotalDesconto += pedidoItem.getValorDesconto();
            }

            var percentualDeDesconto = (valorTotalDesconto / valorTotalProdutos) * 100;
            if (percentualDeDesconto > entity.getVendedor().getPercentualDeDescontoMaximo()) {
                throw new RuntimeException("Percentual de desconto não permitido(percentual: "
                        + percentualDeDesconto + "). Máximo permitido: " + entity.getVendedor().getPercentualDeDescontoMaximo());
            }
        }

    }

    @Override
    protected void postSave(Pedido entity) {
        super.postSave(entity);

        if (entity.getVendedor().getPercentualDeComissao() != null) {
            var valorTotalProdutos = 0D;
            for (PedidoItem pedidoItem : entity.getItens()) {
                valorTotalProdutos += pedidoItem.getValorTotal();
            }

            var valorComissao = valorTotalProdutos * entity.getVendedor().getPercentualDeComissao() / 100;

            if (entity.getVendedor().getEmail() != null) {
                var emailVendedor = new Email("sistema@viasoft.com.br", entity.getVendedor().getEmail());
                emailVendedor.setTitulo("Comissão Pedido de venda " + entity.getId());
                emailVendedor.setConteudo("Valor Total Pedido: " + formatarValor(valorTotalProdutos)
                        + "\n" + "Valor comissão: " + formatarValor(valorComissao));
                emailService.enviarEmail(emailVendedor);
            }
        }

        var emailCliente = new Email("elton@viasoft.com.br", "gaspar@viasoft.com.br");
        emailCliente.setTitulo("Pedido realizado com sucesso");
        emailCliente.setConteudo("Resumo do pedido: \n" + entity.getResumo());
        emailService.enviarEmail(emailCliente);
    }
}
