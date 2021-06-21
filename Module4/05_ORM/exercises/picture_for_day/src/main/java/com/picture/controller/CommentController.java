package com.picture.controller;

import com.picture.model.entity.Comment;
import com.picture.model.service.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class CommentController {
    @Autowired
    private CommentServiceImpl commentService;

    @GetMapping(value = "/")
    public String goHome(Model model) {
        List<Comment> list = commentService.findAll();
        model.addAttribute("comment", new Comment());
        model.addAttribute("comments", list);
        return "home";
    }

    @PostMapping(value = "/save")
    public String saveComment(@ModelAttribute Comment comment){
        commentService.save(comment);
        return "redirect:/";
    }
    
    @GetMapping(value = "/comment/{id}/like")
    public String updateComment(@PathVariable int id){
        commentService.like((long) id);
        return "redirect:/";
    }
}
