package com.devBootCamp.polimorfismo2;

public class Icms implements Imposto {
    private ItemTributavel itemTributavel;

    public Icms(ItemTributavel itemTributavel) {
        this.itemTributavel = itemTributavel;
    }

    @Override
    public Double calcular() {
        if (itemTributavel.getValorATributar() != null && itemTributavel.getValorATributar() > 0) {
            return itemTributavel.getValorATributar() * 2 / 100;
        }
        return 0D;
    }
}
