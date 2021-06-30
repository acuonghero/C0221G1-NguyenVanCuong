package com.codegym.model.service.impl;

import com.codegym.model.entity.Blog;
import com.codegym.model.repository.IBlogRepository;
import com.codegym.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return (List<Blog>) blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findBlogWithCategory(Long id) {
        return blogRepository.findBlogWithCategory(id);
    }
}
