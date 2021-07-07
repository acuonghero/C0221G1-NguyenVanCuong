package com.codegym.model.repository;
import com.codegym.model.entity.Division;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDivisionRepository extends CrudRepository<Division,Long> {
}
