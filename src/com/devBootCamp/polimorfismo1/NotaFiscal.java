package com.devBootCamp.polimorfismo1;

import java.util.ArrayList;
import java.util.List;

import static com.devBootCamp.Util.formatarValor;

public class NotaFiscal {
    private Integer id;
    private List<NotaFiscalItem> notaFiscalItemList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<NotaFiscalItem> getNotaFiscalItemList() {
        return notaFiscalItemList;
    }

    public void setNotaFiscalItemList(List<NotaFiscalItem> notaFiscalItemList) {
        this.notaFiscalItemList = notaFiscalItemList;
    }

    public String resumo() {
        var resumo = new StringBuilder();
        resumo.append("Nota Fiscal: ").append(id).append("\n");
        for (NotaFiscalItem notaFiscalItem : notaFiscalItemList) {
            resumo.append("Valor ICMS: ").append(formatarValor(notaFiscalItem.getValorIcms())).append("\n")
                    .append("Valor PIS: ").append(formatarValor(notaFiscalItem.getValorPis())).append("\n")
                    .append("Valor COFINS: ").append(formatarValor(notaFiscalItem.getValorCofins())).append("\n");
        }
        return resumo.toString();
    }
}
