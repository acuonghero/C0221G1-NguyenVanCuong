package com.codegym.controller;

import com.codegym.model.dto.ContractDto;
import com.codegym.model.entity.Contract;
import com.codegym.model.entity.Customer;
import com.codegym.model.entity.Employee;
import com.codegym.model.entity.Service;
import com.codegym.model.service.IContractService;
import com.codegym.model.service.ICustomerService;
import com.codegym.model.service.IEmployeeService;
import com.codegym.model.service.IService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/contract")
public class ContractController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    ICustomerService customerService;
    @Autowired
    IService serviceImpl;
    @Autowired
    IContractService contractService;

    @ModelAttribute("employee")
    List<Employee> selectAllEmployee(){
       return employeeService.findAll();
    }
    @ModelAttribute("customer")
    List<Customer> selectAllCustomer(){
        return customerService.findAll();
    }
    @ModelAttribute("service")
    List<Service> selectAllService(){
        return serviceImpl.findAll();
    }

    @GetMapping(value = "/create")
    public String showCreateForm(Model model){
        model.addAttribute("contractDto",new ContractDto());
        return "contract/create";
    }
    @PostMapping(value = "/create")
    public String addContract(@Valid @ModelAttribute("contractDto") ContractDto contractDto, BindingResult bindingResult,
                              Model model){
        if(bindingResult.hasErrors()){
            return "contract/create";
        }
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractDto,contract);
        contractService.save(contract);
        model.addAttribute("contractDto", contractDto);
        model.addAttribute("msg","Create new contract successfully");
        return "/contract/create";
    }

}
