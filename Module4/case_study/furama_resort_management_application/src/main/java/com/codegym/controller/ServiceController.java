package com.codegym.controller;

import com.codegym.model.dto.ServiceDto;
import com.codegym.model.entity.RentType;

import com.codegym.model.entity.ServiceType;
import com.codegym.model.service.IRentTypeService;
import com.codegym.model.service.IService;
import com.codegym.model.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/service")
public class ServiceController {
    @Autowired
    IRentTypeService rentTypeService;
    @Autowired
    IServiceTypeService serviceTypeService;
    @Autowired
    IService service;
    @ModelAttribute("rentType")
    List<RentType> findAllRentType(){
        return rentTypeService.findAll();
    }
    @ModelAttribute("serviceType")
    List<ServiceType> findAllRServiceType(){
        return serviceTypeService.findAll();
    }

    @GetMapping(value = "/create")
    public String showCreateForm(Model model){
        model.addAttribute("serviceDto",new ServiceDto());
        return "service/create";
    }
}
