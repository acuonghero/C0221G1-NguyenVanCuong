package com.codegym.appblog.model.service;


import com.codegym.appblog.model.entity.Blog;

import java.util.List;


public interface IGeneralService<T> {
   List<T> findAll();

    Blog findById(Long id);

    void save(T t);

    void remove(Long id);
}
