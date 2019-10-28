package com.devBootCamp.exercicioModelo.item;

import java.util.ArrayList;
import java.util.List;

public class ItemCrudDAOImpl implements ItemCrudDAO {

    @Override
    public Item salvar(Item item) {
        System.out.println("[JPA] - Registro Inserido com Sucesso!");
        return item;
    }

    @Override
    public List<Item> findAll() {
        System.out.println("[JPA] - Registros retornados");
        var itens = new ArrayList<Item>();
        itens.add(new Item("ITEM 1", 1D));
        itens.add(new Item("ITEM 2", 10D));
        itens.add(new Item("ITEM 3", 100D));
        return itens;
    }
}
