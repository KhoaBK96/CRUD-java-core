package com.bia.repository;

import java.util.List;

public interface IBaseRepository<E> {

    boolean add(E object);

    List<E> getAll();

    E getByID(int id);

    boolean update(E object);

    boolean delete(int id);
}
