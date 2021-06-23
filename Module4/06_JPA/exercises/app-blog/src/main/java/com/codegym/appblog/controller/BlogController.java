package com.codegym.appblog.controller;

import com.codegym.appblog.model.entity.Blog;

import com.codegym.appblog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.Optional;


@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping(value = "/blog")
    public String showBlog (Model model,@PageableDefault(value = 1) Pageable pageable){
        Page<Blog> blogList = blogService.findAll(pageable);
        model.addAttribute("blog",blogList);
        return "form";
    }
    @GetMapping(value = "/create")
    public String showCreateForm (Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }
    @PostMapping(value = "/create")
    public String create(@ModelAttribute Blog blog,Model model){
        blogService.save(blog);
        model.addAttribute("mes","New create successfull");
        return "create";
    }
    @GetMapping(value = "/edit/{id}")
    public String showEditForm(Model model, @PathVariable Long id){
        Optional<Blog> blogOptional = blogService.findById(id);
        model.addAttribute("blog",blogOptional);
        return "edit";
    }
    @PostMapping(value = "/update")
    public ModelAndView update(@ModelAttribute Blog blog){
        blogService.save(blog);
        return new ModelAndView("edit","mes","Edit successfully");
    }
    @GetMapping(value = "/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        return new ModelAndView("delete","blog",blogService.findById(id));
    }
    @PostMapping(value = "/delete")
    public String delete(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("mes","Delete successfully");
        return "redirect:/blog";
    }
    @GetMapping("/search")
    public ModelAndView search(@RequestParam("search") Optional<String> searchs, Pageable pageable){
        Page<Blog> blogPage;
        if(searchs.isPresent()){
            blogPage = blogService.findAllByNameContaining(searchs.get(),pageable);
        } else {
            blogPage = blogService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/form");
        modelAndView.addObject("blog", blogPage);
        return modelAndView;
    }
}
