package com.devBootCamp.exercicioModelo.item;

import java.util.List;

public interface ItemCrudDAO {

    Item salvar(Item item);

    List<Item> findAll();
}
