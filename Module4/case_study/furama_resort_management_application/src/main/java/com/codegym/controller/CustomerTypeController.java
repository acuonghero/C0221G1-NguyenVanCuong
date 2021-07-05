package com.codegym.controller;

import com.codegym.model.dto.CustomerTypeDto;
import com.codegym.model.entity.CustomerType;
import com.codegym.model.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(value = "/customer-type")
@Controller
public class CustomerTypeController {
    @Autowired
    ICustomerTypeService customerTypeService;

    @GetMapping(value = "/create")
    public String showCreateForm(Model model){
        model.addAttribute("customerTypeDto",new CustomerTypeDto());
        return "customer_type/create";
    }
    @PostMapping(value = "/create")
    public String addCustomerType(@Valid @ModelAttribute("customerTypeDto") CustomerTypeDto customerTypeDto, BindingResult bindingResult,
                                  Model model){
        if(bindingResult.hasErrors()){
            return "customer_type/create";
        }
        CustomerType customerType = new CustomerType();
        BeanUtils.copyProperties(customerTypeDto,customerType);
        customerTypeService.save(customerType);
        model.addAttribute("customerTypeDto", customerTypeDto);
        model.addAttribute("msg","Create new customer type successfully");
        return "/customer_type/create";
    }

}
