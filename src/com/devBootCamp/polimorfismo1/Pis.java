package com.devBootCamp.polimorfismo1;

public class Pis implements Imposto {
    private ItemTributavel itemTributavel;

    public Pis(ItemTributavel itemTributavel) {
        this.itemTributavel = itemTributavel;
    }

    @Override
    public Double calcular() {
        if (itemTributavel.getValorATributar() != null && itemTributavel.getValorATributar() > 0) {
            return itemTributavel.getValorATributar() * 2.5 / 100;
        }
        return 0D;
    }
}
