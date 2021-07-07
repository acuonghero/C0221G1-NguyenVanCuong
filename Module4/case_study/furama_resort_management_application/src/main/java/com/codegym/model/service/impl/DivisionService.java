package com.codegym.model.service.impl;

import com.codegym.model.entity.Division;
import com.codegym.model.repository.IDivisionRepository;
import com.codegym.model.service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    IDivisionRepository divisionRepository;
    @Override
    public List<Division> findAllDivision(){
        return (List<Division>) divisionRepository.findAll();
    }

}
