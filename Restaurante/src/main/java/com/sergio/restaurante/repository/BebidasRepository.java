package com.sergio.restaurante.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sergio.restaurante.entities.BebidasEntity;

@Repository
public interface BebidasRepository extends CrudRepository<BebidasEntity, Integer>{

}
