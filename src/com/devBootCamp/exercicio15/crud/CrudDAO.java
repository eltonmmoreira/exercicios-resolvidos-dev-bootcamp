package com.devBootCamp.exercicio15.crud;

import java.util.List;

public interface CrudDAO<T> {

    T salvar(T type);

    List<T> findAll();
}
