package com.codegym.model.service;

import com.codegym.model.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService extends IGeneralService<Employee>{
    Page<Employee> findCustomerByNameContaining(String search, Pageable pageable);
}
