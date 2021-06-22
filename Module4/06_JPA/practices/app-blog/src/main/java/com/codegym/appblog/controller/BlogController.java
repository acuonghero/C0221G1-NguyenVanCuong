package com.codegym.appblog.controller;

import com.codegym.appblog.model.entity.Blog;

import com.codegym.appblog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping(value = "/")
    public ModelAndView showBlog (){
        Iterable<Blog> blog = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.addObject("blog",blog);
        return modelAndView;
    }

}
