package com.devBootCamp.polimorfismo1;

public class Main {

    public static void main(String[] args) {
        var notaFiscal = new NotaFiscal();
        var notaFiscalItem = new NotaFiscalItem();
        notaFiscalItem.setQuantidade(10D);
        notaFiscalItem.setValor(100D);

        var notaFiscalItem2 = new NotaFiscalItem();
        notaFiscalItem2.setQuantidade(5D);
        notaFiscalItem2.setValor(200D);

        notaFiscal.getNotaFiscalItemList().add(notaFiscalItem);
        notaFiscal.getNotaFiscalItemList().add(notaFiscalItem2);

        for (NotaFiscalItem notaItem : notaFiscal.getNotaFiscalItemList()) {
            var calculadorDeImposto = new CalculadorDeImposto();
            var valorIcms = calculadorDeImposto.calcularImposto(new Icms(notaItem));
            var valorPis = calculadorDeImposto.calcularImposto(new Pis(notaItem));
            var valorCofins = calculadorDeImposto.calcularImposto(new Cofins(notaItem));

            notaItem.setValorIcms(valorIcms);
            notaItem.setValorPis(valorPis);
            notaItem.setValorCofins(valorCofins);
        }

        System.out.println(notaFiscal.resumo());
    }

}
