package com.devBootCamp.exercicio15.crud;

import com.devBootCamp.exercicio15.BaseObject;

import java.util.List;

public interface CrudService<T extends BaseObject> {

    T salvar(T entity);

    List<T> findAll();
}
