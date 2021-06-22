package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import com.codegym.cms.service.CustomerService;
import com.codegym.cms.service.ICustomerService;
import org.springframework.context.annotation.Bean;

public interface ICustomerRepository extends IGeneralRepository<Customer>{

}
