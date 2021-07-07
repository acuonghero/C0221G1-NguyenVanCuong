package com.codegym.model.service.impl;

import com.codegym.model.entity.Position;
import com.codegym.model.repository.IPositionRepository;
import com.codegym.model.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    IPositionRepository positionRepository;
@Override
public List<Position> findAllPosition(){
       return (List<Position>) positionRepository.findAll();
    }
}
