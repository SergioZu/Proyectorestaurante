package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.sergio.restaurante.DTO.BebidasDTO;
import com.sergio.restaurante.entities.BebidasEntity;

@Repository
public interface BebidasRepository extends CrudRepository<BebidasEntity, Integer>{

	@Query(value = "select new com.sergio.restaurante.dtos.BebidasDTO (b.id,b.nombre,b.precio) "
			+ "FROM com.sergio.colegio.entities.BebidasEntity b "
			+ "WHERE (b.id LIKE CONCAT('%',:id,'%') or :id is null)"
			+ "AND b.nombre LIKE CONCAT ('%',:nombre,'%') "
			+ "AND (b.precio LIKE CONCAT ('%',:precio,'%') or :precio is null ) ")
	 		List<BebidasDTO> obtenerBebidasPorIDNombrePrecio(
					  @Param("id") int id,
					  @Param("nombre") String nombre,
					  @Param("precio") int precio);
}
