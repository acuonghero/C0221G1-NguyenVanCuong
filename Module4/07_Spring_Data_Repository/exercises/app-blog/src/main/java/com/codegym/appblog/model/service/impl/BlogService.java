package com.codegym.appblog.model.service.impl;

import com.codegym.appblog.model.entity.Blog;
import com.codegym.appblog.model.repository.IBlogRepository;
import com.codegym.appblog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository blogRepository;


    @Override
    public List<Blog> findAll() {
        return null;
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Blog blog) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Page<Blog> findAllByNameContaining(String firstname, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return null;
    }
}
