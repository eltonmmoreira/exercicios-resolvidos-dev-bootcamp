package com.devBootCamp.exercicio15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.devBootCamp.Util.formatarData;
import static com.devBootCamp.Util.formatarValor;

public class Pedido implements BaseObject {
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
            System.out.println("Item adicionado" + pedidoItem.getItem().getDescricao());
        }
    }

    private boolean validarItem(PedidoItem pedidoItem) {
        if (pedidoItem.getValorUnitario() <= 0
                || pedidoItem.getValorDesconto() > pedidoItem.getValorTotal()
                || Boolean.TRUE.equals(pedidoItem.getItem().getInativo())
                || pedidoItem.getItem().getQuantidadeEmEstoque() < pedidoItem.getQuantidade()) {
            System.out.println("Item não adicionado - " + pedidoItem.getItem().getDescricao());
            return false;
        }

        return true;
    }

    public String getResumo() {
        StringBuilder resumo = new StringBuilder()
                .append("Código: ").append(id).append("\n")
                .append("Cliente: ").append(cliente.getNome()).append("\n")
                .append("Vendedor: ").append(vendedor.getNome()).append("\n")
                .append("Data de cadastro: ").append(formatarData(dataDeCadastro)).append("\n")
                .append("Data Previsão de Entrega: ").append(formatarData(dataPrevisaoDeEntrega)).append("\n")
                .append("Data de validade: ").append(formatarData(dataDeValidade)).append("\n")
                .append("Endereço de Entrega: ").append(enderecoDeEntrega).append("\n")
                .append("Observação: ").append(observacao).append("\n")
                .append("Forma de pagamento: ").append(formaDePagamento.getLabel()).append("\n \n");

//        System.out.println("Cliente: " + cliente.getNome());
//        System.out.println("Vendedor: " + vendedor.getNome());
//        System.out.println("Data de cadastro: " + dataDeCadastro);
//        System.out.println("Data Previsão de Entrega: " + dataPrevisaoDeEntrega);
//        System.out.println("Data de validade: " + dataDeValidade);
//        System.out.println("Endereço de Entrega: " + enderecoDeEntrega);
//        System.out.println("Observação: " + observacao);
//        System.out.println("Forma de pagamento: " + formaDePagamento.getLabel());
//        System.out.println();

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

//            System.out.println("Produto: " + item.getItem().getDescricao());
//            System.out.println("Quantidade: " + item.getQuantidade());
//            System.out.println("Valor Unitário: " + item.getValorUnitario());
//            System.out.println("Valor Desconto: " + item.getValorDesconto());
//            System.out.println("Valor Total: " + item.getValorTotal());
            if (item.getValorTotal() != null) {
                valorTotal += item.getValorTotal();
            }
            System.out.println();
        }
        resumo.append("Total Pedido: ").append(formatarValor(valorTotal));
        return resumo.toString();
        //System.out.println("Total Pedido: " + valorTotal);
    }
}
