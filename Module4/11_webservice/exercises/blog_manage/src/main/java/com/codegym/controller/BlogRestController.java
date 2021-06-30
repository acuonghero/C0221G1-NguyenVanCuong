package com.codegym.controller;

import com.codegym.model.entity.Blog;
import com.codegym.model.entity.Category;
import com.codegym.model.service.IBlogService;
import com.codegym.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BlogRestController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;

    @GetMapping(value = "/category")
    public ResponseEntity<List<Category>> showAllCategory() {
        List<Category> categoryList = categoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping(value = "/blog")
    public ResponseEntity<List<Blog>> showAllBlog() {
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Blog>> findBlogWithCategory(@PathVariable Long id) {
        List<Blog> blogList = blogService.findBlogWithCategory(id);
        if (!blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
    @GetMapping(value = "/blog/{id}")
    public ResponseEntity<Optional<Blog>> findBlogById(@PathVariable Long id) {
        Optional<Blog> blog = blogService.findById(id);
        if (blog==null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
