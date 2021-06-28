package com.codegym.model.repository;


import com.codegym.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product,Long> {
    @Query(value = "select * from product where concat(`name`,`describes`) like :keySearch",nativeQuery = true)
    Page<Product> findByNameAndDescribe(@Param("keySearch") String keySearch, Pageable pageable);

//    @Query(value = "select * from product order by `date` desc", nativeQuery = true)
}
