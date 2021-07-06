package com.codegym.model.service;

import com.codegym.model.entity.ServiceType;

import java.util.List;

public interface IServiceTypeService {
    List<ServiceType> findAll();
}
