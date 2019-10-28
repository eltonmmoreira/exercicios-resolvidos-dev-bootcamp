package com.devBootCamp.exercicio15;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAO<T> {

    protected T salvar(T type) {
        return type;
    }

    protected List<T> findAll() {
        return new ArrayList<>();
    }
}
