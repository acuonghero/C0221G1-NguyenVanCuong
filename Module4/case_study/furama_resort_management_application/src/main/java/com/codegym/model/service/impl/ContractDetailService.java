package com.codegym.model.service.impl;

import com.codegym.model.entity.ContractDetail;
import com.codegym.model.repository.IContractDetailRepository;
import com.codegym.model.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    IContractDetailRepository contractDetailRepository;

    @Override
    public Page<ContractDetail> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<ContractDetail> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<ContractDetail> findAll() {
        return null;
    }
}
