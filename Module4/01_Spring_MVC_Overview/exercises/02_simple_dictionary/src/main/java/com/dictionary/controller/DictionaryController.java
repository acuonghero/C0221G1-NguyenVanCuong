package com.dictionary.controller;

import com.dictionary.model.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService dictionaryService;
    @GetMapping(value = "/")
    public String showform(){
        return "form";
    }
    @PostMapping(value = "/translate")
    public String result(@RequestParam String input, Model model){
        List<String> result = dictionaryService.translate(input);
        model.addAttribute("result",result);
        return "form";
    }
}
