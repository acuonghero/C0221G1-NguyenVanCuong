package com.codegym.model.service;

import com.codegym.model.entity.CustomerType;

import java.util.List;

public interface ICustomerTypeService extends IGeneralService<CustomerType> {
    List<CustomerType> findAll();
}
