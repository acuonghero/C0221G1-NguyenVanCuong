package com.codegym.model.repository;

import com.codegym.model.entity.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionRepository extends CrudRepository<Position,Long> {
}
