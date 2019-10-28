package com.devBootCamp.exercicio15.crud;

import java.util.ArrayList;
import java.util.List;

public class CrudDAOImpl<T> implements CrudDAO<T> {

    @Override
    public T salvar(T entity) {
        System.out.println("[JPA] - Registro Inserido com Sucesso!");
        return entity;
    }

    @Override
    public List<T> findAll() {
        System.out.println("[JPA] - Registros retornados");
        return new ArrayList<>();
    }

}
