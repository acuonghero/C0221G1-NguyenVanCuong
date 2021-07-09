package com.codegym.model.service.impl;



import com.codegym.model.repository.IServiceRepository;
import com.codegym.model.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class ServiceImpl implements IService {
    @Autowired
    IServiceRepository serviceRepository;


    @Override
    public Page<com.codegym.model.entity.Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Optional<com.codegym.model.entity.Service> findById(Long id) {
        return serviceRepository.findById(id);
    }

    @Override
    public void save(com.codegym.model.entity.Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void remove(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public List<com.codegym.model.entity.Service> findAll() {
        return (List<com.codegym.model.entity.Service>) serviceRepository.findAll();
    }
}
