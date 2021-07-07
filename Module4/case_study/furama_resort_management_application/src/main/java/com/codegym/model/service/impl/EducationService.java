package com.codegym.model.service.impl;

import com.codegym.model.entity.EducationDegree;
import com.codegym.model.repository.IEducationDegreeRepository;
import com.codegym.model.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements IEducationService {
    @Autowired
    IEducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAllEducation(){
         return (List<EducationDegree>) educationDegreeRepository.findAll();
    }
}
