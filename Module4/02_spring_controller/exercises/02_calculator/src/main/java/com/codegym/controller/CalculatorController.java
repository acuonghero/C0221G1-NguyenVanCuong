package com.codegym.controller;

import com.codegym.model.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CalculatorController {
    @Autowired
    ICalculatorService calculatorService;
    @GetMapping(value = "")
    public String showFormCalculator(){
        return "form";
    }
    @GetMapping("/calculator")
    public String calculator(@RequestParam Map<String,String> map, Model model){
        String result = calculatorService.calculator(map);
        model.addAttribute("result",result);
        return "form";
    }
}
