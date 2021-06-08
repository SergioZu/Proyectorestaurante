package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sergio.restaurante.DTO.BebidasDTO;
import com.sergio.restaurante.DTO.EntranteDTO;
import com.sergio.restaurante.entities.EntranteEntity;



@Repository
public interface EntranteRepository extends CrudRepository<EntranteEntity, Integer>{

	@Query(value = "select new com.sergio.restaurante.DTO.EntranteDTO (e.id,e.nombre,e.precio) "
			+ "FROM com.sergio.restaurante.entities.EntranteEntity e "
			+ "WHERE (e.id LIKE CONCAT('%',:id,'%') or :id is null) "
			+ "AND e.nombre LIKE CONCAT ('%',:nombre,'%') "
			+ "AND (e.precio LIKE CONCAT ('%',:precio,'%') or :precio is null ) ")
	 		List<EntranteDTO> obtenerEntratePorIDNombrePrecio(
					  @Param("id") int id,
					  @Param("nombre") String nombre,
					  @Param("precio") int precio);
}
