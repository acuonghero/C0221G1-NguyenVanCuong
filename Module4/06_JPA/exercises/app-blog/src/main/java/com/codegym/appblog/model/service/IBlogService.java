package com.codegym.appblog.model.service;

import com.codegym.appblog.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IBlogService extends IGeneralService<Blog>{
    Page<Blog> findAllByNameContaining(String firstname, Pageable pageable);
    Page<Blog> findAll(Pageable pageable);

}
