package com.codegym.model.repository;

import com.codegym.model.entity.Service;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IServiceRepository extends PagingAndSortingRepository<Service,Long> {
}
