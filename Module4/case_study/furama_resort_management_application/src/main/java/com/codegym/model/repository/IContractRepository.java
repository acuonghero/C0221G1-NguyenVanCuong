package com.codegym.model.repository;

import com.codegym.model.entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends PagingAndSortingRepository<Contract,Long> {
    @Query(value = "select * from contract left join customer on contract.customer_id = customer.id" +
            " where customer.name like %?1% and contract.end_date >= now()",nativeQuery = true)
    Page<Contract> findAllByCustomerName(String name, Pageable pageable);

}
