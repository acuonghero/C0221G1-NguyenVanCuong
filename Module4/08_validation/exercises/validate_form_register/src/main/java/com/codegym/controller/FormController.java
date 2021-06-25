package com.codegym.controller;

import com.codegym.model.dto.FormDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormController {
    @GetMapping("/register")
    public ModelAndView showForm() {
        return new ModelAndView("index","formDto", new FormDto());
    }

    @PostMapping("/validateForm")
    public ModelAndView checkValidation(@Validated @ModelAttribute("formDto") FormDto formDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("index");
        }
        return new ModelAndView("result");
    }
}
