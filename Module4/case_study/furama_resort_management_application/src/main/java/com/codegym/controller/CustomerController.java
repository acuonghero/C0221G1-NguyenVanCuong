package com.codegym.controller;

import com.codegym.model.dto.CustomerDto;
import com.codegym.model.entity.Customer;
import com.codegym.model.entity.CustomerType;
import com.codegym.model.service.ICustomerService;
import com.codegym.model.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;


    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customerType",customerTypeList);
        modelAndView.addObject("customerDto", new CustomerDto());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView addCustomer(@ModelAttribute("customerDto") @Valid CustomerDto customerDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return new ModelAndView("customer/create");
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customerDto", customerDto);
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }


    @GetMapping({"","/list"})
    public ModelAndView showCustomerList(@RequestParam("search") Optional<String> search, @PageableDefault(value = 5) Pageable pageable){
        Page<Customer> customers;
//        if(search.isPresent()){
//            customers = customerService.findAllByFirstNameContaining(search.get(), pageable);
//        } else {
            customers = customerService.findAll(pageable);
//        }
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

//    @GetMapping("/edit-customer/{id}")
//    public ModelAndView showEditForm(@PathVariable Long id) {
//        Optional<Customer> customer = customerService.findById(id);
//        if (customer.isPresent()) {
//            ModelAndView modelAndView = new ModelAndView("/customer/edit");
//            modelAndView.addObject("customer", customer.get());
//            return modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/edit-customer")
//    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer) {
//        customerService.save(customer);
//        ModelAndView modelAndView = new ModelAndView("/customer/edit");
//        modelAndView.addObject("customer", customer);
//        modelAndView.addObject("message", "Customer updated successfully");
//        return modelAndView;
//    }
//
//    @GetMapping("/delete-customer/{id}")
//    public ModelAndView showDeleteForm(@PathVariable Long id) {
//        Optional<Customer> customer = customerService.findById(id);
//        if (customer.isPresent()) {
//            ModelAndView modelAndView = new ModelAndView("/customer/delete");
//            modelAndView.addObject("customer", customer.get());
//            return modelAndView;
//
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/delete-customer")
//    public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
//        customerService.remove(customer.getId());
//        return "redirect:customers";
//    }

}
