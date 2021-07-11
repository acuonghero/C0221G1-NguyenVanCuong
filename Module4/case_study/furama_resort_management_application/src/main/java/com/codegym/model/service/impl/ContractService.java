package com.codegym.model.service.impl;

import com.codegym.model.entity.Contract;
import com.codegym.model.repository.IContractRepository;
import com.codegym.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class ContractService implements IContractService {
    @Autowired
    IContractRepository contractRepository;
    @Override
    public Page<Contract> findAll(Pageable pageable) {
        Page<Contract> contractPage =contractRepository.findAll(pageable);
        for(Contract c : contractPage){
            try {
                Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(c.getStartDate());
                Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(c.getEndDate());
                Double totalMoney = endDate.compareTo(startDate)*c.getService().getCost()-c.getDeposit();
                c.setTotalMoney(totalMoney);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return contractPage;
    }

    @Override
    public Optional<Contract> findById(Long id) {
        return contractRepository.findById(id);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void remove(Long id) {
        contractRepository.deleteById(id);
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
