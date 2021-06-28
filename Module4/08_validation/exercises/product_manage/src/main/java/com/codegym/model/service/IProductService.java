package com.codegym.model.service;

import com.codegym.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
    void save(Product product);
    void delete(Long id);
    Page<Product> findByNameAndDescribe(@Param("search") String search, Pageable pageable);
}
