package com.codegym.model.service.impl;

import com.codegym.model.entity.Contract;
import com.codegym.model.repository.IContractRepository;
import com.codegym.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
@Service
public class ContractService implements IContractService {
    @Autowired
    IContractRepository contractRepository;
    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Contract> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<Contract> findAll() {
        return (List<Contract>) contractRepository.findAll();
    }

    @Override
    public Page<Contract> findAllByCustomerName(String name, Pageable pageable) {
        return contractRepository.findAllByCustomerName(name,pageable);
    }
}
