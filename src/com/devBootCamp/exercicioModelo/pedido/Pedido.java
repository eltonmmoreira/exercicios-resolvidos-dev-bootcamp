package com.devBootCamp.exercicioModelo.pedido;

import com.devBootCamp.exercicioModelo.vendedor.Vendedor;
import com.devBootCamp.exercicioModelo.cliente.Cliente;
import com.devBootCamp.exercicioModelo.cliente.Endereco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.devBootCamp.Util.formatarData;
import static com.devBootCamp.Util.formatarValor;

public class Pedido {
    private Integer id;
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDateTime dataDeCadastro;
    private LocalDate dataPrevisaoDeEntrega;
    private LocalDate dataDeValidade;
    private Endereco enderecoDeEntrega;
    private String observacao;
    private FormaDePagamento formaDePagamento;
    private List<PedidoItem> itens = new ArrayList<>();

    public Pedido(Cliente cliente, Vendedor vendedor, LocalDateTime dataDeCadastro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataDeCadastro = dataDeCadastro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataPrevisaoDeEntrega() {
        return dataPrevisaoDeEntrega;
    }

    public void setDataPrevisaoDeEntrega(LocalDate dataPrevisaoDeEntrega) {
        this.dataPrevisaoDeEntrega = dataPrevisaoDeEntrega;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public Endereco getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public List<PedidoItem> getItens() {
        return itens;
    }

    public void adicionarItem(PedidoItem pedidoItem) {
        if (validarItem(pedidoItem)) {
            itens.add(pedidoItem);
            System.out.println("Item adicionado - " + pedidoItem.getItem().getDescricao());
        }
    }

    @SuppressWarnings("Duplicates")
    private boolean validarItem(PedidoItem pedidoItem) {
        if (pedidoItem.getValorUnitario() <= 0 || pedidoItem.getItem().getQuantidadeEmEstoque() < pedidoItem.getQuantidade()) {
            System.out.println("Item não adicionado - " + pedidoItem.getItem().getDescricao());
            return false;
        }

        return true;
    }

    @SuppressWarnings("Duplicates")
    public String getResumo() {
        StringBuilder resumo = new StringBuilder()
                .append("Cliente: ").append(cliente.getNome()).append("\n")
                .append("Vendedor: ").append(vendedor.getNome()).append("\n")
                .append("Data de cadastro: ").append(formatarData(dataDeCadastro)).append("\n")
                .append("Data Previsão de Entrega: ").append(formatarData(dataPrevisaoDeEntrega)).append("\n")
                .append("Data de validade: ").append(formatarData(dataDeValidade)).append("\n")
                .append("Endereço de Entrega: ").append(enderecoDeEntrega).append("\n")
                .append("Observação: ").append(observacao).append("\n")
                .append("Forma de pagamento: ").append(formaDePagamento != null ? formaDePagamento.getLabel() : null).append("\n \n");

        var valorTotal = 0D;
        for (PedidoItem item : itens) {
            resumo.append("Produto: ")
                    .append(item.getItem().getDescricao())
                    .append("\n")
                    .append("Quantidade: ")
                    .append(item.getQuantidade())
                    .append("\n" )
                    .append("Valor Unitário: ")
                    .append(formatarValor(item.getValorUnitario()))
                    .append("\n")
                    .append("Valor Desconto: ")
                    .append(formatarValor(item.getValorDesconto()))
                    .append("\n")
                    .append("Valor Total: ")
                    .append(formatarValor(item.getValorTotal()))
                    .append("\n");

            if (item.getValorTotal() != null) {
                valorTotal += item.getValorTotal();
            }
            System.out.println();
        }
        resumo.append("Total Pedido: ").append(formatarValor(valorTotal));
        return resumo.toString();
    }
}
