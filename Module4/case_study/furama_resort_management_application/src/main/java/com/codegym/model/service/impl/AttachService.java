package com.codegym.model.service.impl;

import com.codegym.model.repository.IAttachServiceRepository;
import com.codegym.model.service.IAttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttachService implements IAttachService {
    @Autowired
    IAttachServiceRepository attachServiceRepository;
    @Override
    public Page<com.codegym.model.entity.AttachService> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<com.codegym.model.entity.AttachService> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(com.codegym.model.entity.AttachService attachService) {
        attachServiceRepository.save(attachService);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<com.codegym.model.entity.AttachService> findAll() {
        return (List<com.codegym.model.entity.AttachService>) attachServiceRepository.findAll();
    }
}
