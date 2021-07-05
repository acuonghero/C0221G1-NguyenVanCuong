package com.codegym.model.repository;

import com.codegym.model.entity.CustomerType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepository extends PagingAndSortingRepository<CustomerType,Long> {
}
