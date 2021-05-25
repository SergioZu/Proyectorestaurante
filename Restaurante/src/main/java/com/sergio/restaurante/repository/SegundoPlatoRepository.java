package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sergio.restaurante.DTO.BebidasDTO;

@Repository
public interface SegundoPlatoRepository {

	@Query(value = "select new com.sergio.restaurante.dtos.SegundoPlatoDTO (s.id,s.nombre,s.precio) "
			+ "FROM com.sergio.colegio.entities.SegundoPlatoEntity s "
			+ "WHERE (s.id LIKE CONCAT('%',:id,'%') or :id is null)"
			+ "AND s.nombre LIKE CONCAT ('%',:nombre,'%') "
			+ "AND s.precio LIKE CONCAT ('%',:precio,'%') or :precio is null ) ")
	 		List<BebidasDTO> obtenerRolPorUsernamePassword(
					  @Param("id") String id,
					  @Param("nombre") String nombre,
					  @Param("precio") String precio);
}
