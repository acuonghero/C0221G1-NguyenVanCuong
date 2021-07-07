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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @ModelAttribute("customerType")
    List<CustomerType> showCustomerTypeList(){
        return customerTypeService.findAll();
    }
    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
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
//        modelAndView.addObject("customerType",customerTypeService.findAll());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }


    @GetMapping({"","/list"})
    public ModelAndView showCustomerList(@RequestParam("search") Optional<String> search, @PageableDefault(value = 3) Pageable pageable){
        Page<Customer> customers = customerService.findCustomerByNameContaining(search.orElse(""), pageable);
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers", customers);
        modelAndView.addObject("search", search.orElse(""));
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        CustomerDto customerDto = new CustomerDto();
        if (customer.isPresent()) {
            BeanUtils.copyProperties(customer.get(),customerDto);
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customerDto", customerDto);
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView("customer/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/update")
    public ModelAndView updateCustomer(@Valid @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return new ModelAndView("customer/edit");
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        customerService.save(customer);
        return new ModelAndView("customer/edit","msg","Update customer successfully");
    }

    @PostMapping("/delete")
    public String showDeleteForm(@RequestParam Long id, RedirectAttributes redirectAttributes) {
        Optional<Customer> customer = customerService.findById(id);
        if(customer.get()==null){
            return "customer/error.404";
        }
        customer.get().setFlag(false);
        customerService.save(customer.get());
        redirectAttributes.addFlashAttribute("msg","Delete successfully");
        return "redirect:/customer";
    }

}
