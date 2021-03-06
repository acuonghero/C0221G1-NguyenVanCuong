package com.codegym.model.service.impl;

import com.codegym.model.entity.RentType;
import com.codegym.model.repository.IRentTypeRepository;
import com.codegym.model.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    IRentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return (List<RentType>) rentTypeRepository.findAll();
    }
}
