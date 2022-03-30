package com.bia.service;


import java.util.List;

public interface IService<E> {

    boolean add(E object);

    List<E> getAll();

    E getByID(int id);

    boolean update(E object);

    boolean delete(int id);


}
