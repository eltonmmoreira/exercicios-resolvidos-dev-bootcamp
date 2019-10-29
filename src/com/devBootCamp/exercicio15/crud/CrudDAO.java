package com.devBootCamp.exercicio15.crud;

import com.devBootCamp.exercicio15.BaseObject;

import java.util.List;

public interface CrudDAO<T extends BaseObject> {

    T salvar(T type);

    List<T> findAll();
}
