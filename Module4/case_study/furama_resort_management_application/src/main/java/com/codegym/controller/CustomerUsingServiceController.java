package com.codegym.controller;

import com.codegym.model.entity.*;
import com.codegym.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/using-service")
public class CustomerUsingServiceController {
    @Autowired
    IContractService contractService;
    @Autowired
    IService serviceImpl;
    @Autowired
    IAttachService attachService;
    @Autowired
    ICustomerService customerService;
    @Autowired
    IEmployeeService employeeService;
    @ModelAttribute("customer")
    List<Customer> selectAllCustomerList(){
        return customerService.findAll();
    }
    @ModelAttribute("employee")
    List<Employee> selectAllEmployee(){
        return employeeService.findAll();
    }
    @ModelAttribute("service")
    List<Service> selectAllService(){
        return serviceImpl.findAll();
    }
    @GetMapping(value = "")
    public ModelAndView showList(@RequestParam Optional<String> search, Pageable pageable){
        List<AttachService> attachServices = attachService.findAll();
        String nameValue = "";
        if(search.isPresent()){
            nameValue = search.get();
        }
        Page<Contract> contractPage = contractService.findAllByCustomerName(nameValue,pageable);
        return new ModelAndView("using_service/list").addObject("attachService",attachServices)
                .addObject("contract",contractPage);
    }
    @GetMapping(value = "/edit/{id}")
    public ModelAndView showEditForm(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("using_service/edit");
        Optional<Contract> contract= contractService.findById(id);
        modelAndView.addObject("contract",contract.get());
        return modelAndView;
    }
    @PostMapping("/update")
    public ModelAndView updateContract(@ModelAttribute Contract contract){
        ModelAndView modelAndView = new ModelAndView("using_service/edit");
        contractService.save(contract);
       return modelAndView.addObject("msg","Edit successfully").addObject("contract",contract);
    }
    @PostMapping("/delete")
    public ModelAndView deleteContract(@RequestParam Long id){
        Optional<Contract> contract = contractService.findById(id);
        contract.get().setFlag(false);
        contractService.save(contract.get());
        return new ModelAndView("using_service/list","msg","Delete successfully !!");
    }
}
