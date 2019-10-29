package com.devBootCamp.exercicio15.crud;

import com.devBootCamp.exercicio15.BaseObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CrudDAOImpl<T extends BaseObject> implements CrudDAO<T> {

    private List<T> list = new ArrayList<>();

    private Random random = new Random();

    @Override
    public T salvar(T entity) {
        System.out.println("[JPA] - Registro Inserido com Sucesso!");
        entity.setId(random.nextInt());
        list.add(entity);
        return entity;
    }

    @Override
    public List<T> findAll() {
        System.out.println("[JPA] - Registros retornados");
        return list;
    }

}
