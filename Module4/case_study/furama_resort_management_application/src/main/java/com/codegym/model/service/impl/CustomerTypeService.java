package com.codegym.model.service.impl;

import com.codegym.model.entity.CustomerType;
import com.codegym.model.repository.ICustomerTypeRepository;
import com.codegym.model.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    ICustomerTypeRepository customerTypeRepository;
    @Override
    public Page<CustomerType> findAll(Pageable pageable) {
        return customerTypeRepository.findAll(pageable);
    }

    @Override
    public Optional<CustomerType> findById(Long id) {
        return customerTypeRepository.findById(id);
    }

    @Override
    public void save(CustomerType customerType) {
        customerTypeRepository.save(customerType);
    }

    @Override
    public void remove(Long id) {
        customerTypeRepository.deleteById(id);
    }

    @Override
    public List<CustomerType> findAll() {
        return (List<CustomerType>) customerTypeRepository.findAll();
    }
}
