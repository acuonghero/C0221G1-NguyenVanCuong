package com.codegym.model.service.impl;

import com.codegym.model.entity.Category;
import com.codegym.model.repository.ICategoryRepository;
import com.codegym.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository categoryService;
    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryService.findAll();
    }

    @Override
    public Optional<com.codegym.model.entity.Category> findById(Long id) {
        return categoryService.findById(id);
    }

    @Override
    public void save(com.codegym.model.entity.Category category) {
        categoryService.save(category);
    }

    @Override
    public void remove(Long id) {
        categoryService.deleteById(id);
    }
}
