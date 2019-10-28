package com.devBootCamp.exercicioModelo.crud;

import java.util.List;

public interface CrudService<T> {

    T salvar(T entity);

    List<T> findAll();
}
