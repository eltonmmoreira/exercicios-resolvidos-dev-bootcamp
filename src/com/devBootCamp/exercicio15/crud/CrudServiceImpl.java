package com.devBootCamp.exercicio15.crud;

import com.devBootCamp.exercicio15.BaseObject;

import java.util.List;

public abstract class CrudServiceImpl<T extends BaseObject> implements CrudService<T> {

    protected abstract CrudDAO<T> getCrudDAO();

    @Override
    public T salvar(T entity) {
        preSave(entity);
        entity = getCrudDAO().salvar(entity);
        postSave(entity);
        return entity;
    }

    @Override
    public List<T> findAll() {
        return getCrudDAO().findAll();
    }

    protected void preSave(T entity) {
        System.out.println("Antes de Salvar");
    }

    protected void postSave(T entity) {
        System.out.println("Depois de Salvar");
    }
}
