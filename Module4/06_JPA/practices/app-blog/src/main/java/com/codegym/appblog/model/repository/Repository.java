package com.codegym.appblog.model.repository;


import com.codegym.appblog.model.entity.Blog;


import java.util.List;


public interface Repository<T> {
    List<T> findAll();

    Blog findById(Long id);

    void save(T t);

    void remove(Long id);
}
