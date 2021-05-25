package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sergio.restaurante.DTO.BebidasDTO;
import com.sergio.restaurante.entities.PrimerPlatoEntity;


@Repository
public interface PrimerPlatoRepository extends CrudRepository<PrimerPlatoEntity, Integer>{

	@Query(value = "select new com.sergio.restaurante.dtos.PrimerPlatoDTO (pp.id,pp.nombre,pp.precio) "
			+ "FROM com.sergio.colegio.entities.PrimerPlatoEntity pp "
			+ "WHERE (pp.id LIKE CONCAT('%',:id,'%') or :id is null)"
			+ "AND pp.nombre LIKE CONCAT ('%',:nombre,'%') "
			+ "AND pp.precio LIKE CONCAT ('%',:precio,'%') or :precio is null ) ")
	 		List<BebidasDTO> obtenerRolPorUsernamePassword(
					  @Param("id") String id,
					  @Param("nombre") String nombre,
					  @Param("precio") String precio);
}
