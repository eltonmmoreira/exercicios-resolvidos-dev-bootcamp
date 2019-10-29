package com.devBootCamp.polimorfismo2;

public class Cofins implements Imposto {
    private ItemTributavel itemTributavel;

    public Cofins(ItemTributavel itemTributavel) {
        this.itemTributavel = itemTributavel;
    }

    @Override
    public Double calcular() {
        if (itemTributavel.getValorATributar() != null && itemTributavel.getValorATributar() > 0) {
            return itemTributavel.getValorATributar() * 1.5 / 100;
        }
        return 0D;
    }
}
