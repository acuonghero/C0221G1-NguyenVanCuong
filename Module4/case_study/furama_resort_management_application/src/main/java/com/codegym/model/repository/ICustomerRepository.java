package com.codegym.model.repository;

import com.codegym.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    @Query(value = "select * from customer where `name` like %?1% and flag = 0",nativeQuery = true)
    Page<Customer> findCustomerByNameContaining(String search, Pageable pageable);
}
