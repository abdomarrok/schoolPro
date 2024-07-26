package com.marrok.schoolmanager.dao;

import com.marrok.schoolmanager.model.Teacher;

import java.util.List;

public interface GenericDAO<T> {
    void save(T entity);


    void update(T entity);



    T getById(int id);
    List<T> getAll();
    void delete(int id);
}

