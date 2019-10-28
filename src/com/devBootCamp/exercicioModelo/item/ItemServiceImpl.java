package com.devBootCamp.exercicioModelo.item;

import java.util.List;

public class ItemServiceImpl implements ItemService {

    private ItemCrudDAO itemCrudDAO = new ItemCrudDAOImpl();

    @Override
    public Item salvar(Item item) {
        return itemCrudDAO.salvar(item);
    }

    @Override
    public List<Item> findAll() {
        return itemCrudDAO.findAll();
    }
}
