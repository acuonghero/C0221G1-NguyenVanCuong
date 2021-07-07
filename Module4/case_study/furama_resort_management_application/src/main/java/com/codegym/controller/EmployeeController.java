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


    @GetMapping(value = {"","/list"})
    public ModelAndView showEmployeeList(@RequestParam("search") Optional<String> search, @PageableDefault(value = 3) Pageable pageable){
        Page<Employee> employees = employeeService.findCustomerByNameContaining(search.orElse(""), pageable);
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("employees", employees);
        modelAndView.addObject("search", search.orElse(""));
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<Employee> employee = employeeService.findById(id);
        EmployeeDto employeeDto = new EmployeeDto();
        if (employee.isPresent()) {
            BeanUtils.copyProperties(employee.get(),employeeDto);
            ModelAndView modelAndView = new ModelAndView("/employee/edit");
            modelAndView.addObject("employeeDto", employeeDto);
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView("customer/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/update")
    public ModelAndView updateCustomer(@Valid @ModelAttribute("employeeDto") EmployeeDto employeeDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return new ModelAndView("employee/edit");
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        employeeService.save(employee);
        return new ModelAndView("employee/edit","msg","Update customer successfully");
    }

    @PostMapping("/delete")
    public String deleteEmployee(@RequestParam Long id, RedirectAttributes redirectAttributes) {
        Optional<Employee> employee = employeeService.findById(id);
        if(employee.get()==null){
            return "customer/error.404";
        }
        employee.get().setFlag(false);
        employeeService.save(employee.get());
        redirectAttributes.addFlashAttribute("msg","Delete successfully");
        return "redirect:/employee";
    }
}
