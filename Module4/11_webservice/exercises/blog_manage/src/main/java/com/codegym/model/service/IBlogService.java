package com.codegym.model.service;

import com.codegym.model.entity.Blog;

import java.util.List;

public interface IBlogService extends IGeneralService<Blog> {
    List<Blog> findBlogWithCategory(Long id);
}
