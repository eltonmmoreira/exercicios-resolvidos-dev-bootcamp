package com.devBootCamp.exercicioModelo.item;

import java.util.List;

public interface ItemService {

    Item salvar(Item item);

    List<Item> findAll();
}
