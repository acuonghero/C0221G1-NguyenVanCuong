package com.codegym.model.repository;

import com.codegym.model.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
    @Query(value = "select * from employee where `name` like %?1% and flag = 1",nativeQuery = true)
    Page<Employee> findCustomerByNameContaining(String search, Pageable pageable);
}
