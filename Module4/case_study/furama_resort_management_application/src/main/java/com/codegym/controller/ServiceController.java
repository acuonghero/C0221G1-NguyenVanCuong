package com.codegym.controller;

import com.codegym.model.dto.ServiceDto;
import com.codegym.model.entity.RentType;

import com.codegym.model.entity.Service;
import com.codegym.model.entity.ServiceType;
import com.codegym.model.service.IRentTypeService;
import com.codegym.model.service.IService;
import com.codegym.model.service.IServiceTypeService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/service")
public class ServiceController {
    @Autowired
    IRentTypeService rentTypeService;
    @Autowired
    IServiceTypeService serviceTypeService;
    @Autowired
    IService serviceImpl;
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

    @PostMapping(value = "/create")
    public ModelAndView createService(@ModelAttribute @Valid ServiceDto serviceDto, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()){
            modelAndView.addObject("service/create").addObject("serviceDto",serviceDto);
        }
        Service service = new Service();
        BeanUtils.copyProperties(serviceDto,service);
        serviceImpl.save(service);
        return modelAndView.addObject("msg","Create service Successfully !!");
    }
}
