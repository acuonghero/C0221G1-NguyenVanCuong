package com.codegym.controller;

import com.codegym.model.dto.CustomerDto;
import com.codegym.model.dto.EmployeeDto;
import com.codegym.model.entity.*;
import com.codegym.model.service.*;
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
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private IDivisionService divisionService;
    @Autowired
    private IEducationService educationService;
    @Autowired
    private IPositionService positionService;
    @Autowired
    IEmployeeService employeeService;

    @ModelAttribute("division")
    List<Division> showDivisionList(){
        return divisionService.findAllDivision();
    }
    @ModelAttribute("education")
    List<EducationDegree> showEducationList(){
        return educationService.findAllEducation();
    }
    @ModelAttribute("position")
    List<Position> showPositionList(){
        return positionService.findAllPosition();
    }
    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("employeeDto", new EmployeeDto());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView addCustomer(@ModelAttribute("employeeDto") @Valid EmployeeDto employeeDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return new ModelAndView("employee/create");
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("customerDto", employeeDto);
        modelAndView.addObject("msg", "New customer created successfully");
        return modelAndView;
    }

//
//    @GetMapping({"","/list"})
//    public ModelAndView showCustomerList(@RequestParam("search") Optional<String> search, @PageableDefault(value = 3) Pageable pageable){
//        Page<Customer> customers = customerService.findCustomerByNameContaining(search.orElse(""), pageable);
//        ModelAndView modelAndView = new ModelAndView("customer/list");
//        modelAndView.addObject("customers", customers);
//        modelAndView.addObject("search", search.orElse(""));
//        return modelAndView;
//    }
//
//    @GetMapping("/edit/{id}")
//    public ModelAndView showEditForm(@PathVariable Long id) {
//        Optional<Customer> customer = customerService.findById(id);
//        CustomerDto customerDto = new CustomerDto();
//        if (customer.isPresent()) {
//            BeanUtils.copyProperties(customer.get(),customerDto);
//            ModelAndView modelAndView = new ModelAndView("/customer/edit");
//            modelAndView.addObject("customerDto", customerDto);
//            return modelAndView;
//        }
//        else {
//            ModelAndView modelAndView = new ModelAndView("customer/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/update")
//    public ModelAndView updateCustomer(@Valid @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult) {
//        if(bindingResult.hasErrors()){
//            return new ModelAndView("customer/edit");
//        }
//        Customer customer = new Customer();
//        BeanUtils.copyProperties(customerDto,customer);
//        customerService.save(customer);
//        return new ModelAndView("customer/edit","msg","Update customer successfully");
//    }
//
//    @PostMapping("/delete")
//    public String showDeleteForm(@RequestParam Long id, RedirectAttributes redirectAttributes) {
//        Optional<Customer> customer = customerService.findById(id);
//        if(customer.get()==null){
//            return "customer/error.404";
//        }
//        customer.get().setFlag(true);
//        customerService.save(customer.get());
//        redirectAttributes.addFlashAttribute("msg","Delete successfully");
//        return "redirect:/customer";
//    }
}
