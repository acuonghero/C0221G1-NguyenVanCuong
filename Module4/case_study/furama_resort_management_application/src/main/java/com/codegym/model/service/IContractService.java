package com.codegym.model.service;

import com.codegym.model.entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService extends IGeneralService<Contract> {
    Page<Contract> findAllByCustomerName(String name, Pageable pageable);
}
