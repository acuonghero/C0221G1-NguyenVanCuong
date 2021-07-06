package com.codegym.model.service.impl;

import com.codegym.model.entity.ServiceType;
import com.codegym.model.repository.IServiceTypeRepository;
import com.codegym.model.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTypeService implements IServiceTypeService {
    @Autowired
    IServiceTypeRepository serviceTypeRepository;
    @Override
    public List<ServiceType> findAll() {
        return (List<ServiceType>) serviceTypeRepository.findAll();
    }
}
