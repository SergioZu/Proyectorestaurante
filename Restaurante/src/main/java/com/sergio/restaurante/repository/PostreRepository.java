package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sergio.restaurante.DTO.BebidasDTO;
import com.sergio.restaurante.DTO.PostreDTO;
import com.sergio.restaurante.entities.PostreEntity;



@Repository
public interface PostreRepository extends CrudRepository<PostreEntity, Integer>{

	@Query(value = "select new com.sergio.restaurante.dtos.PostreDTO (p.id,p.nombre,p.precio) "
			+ "FROM com.sergio.colegio.entities.PostreEntity p "
			+ "WHERE (p.id LIKE CONCAT('%',:id,'%') or :id is null)"
			+ "AND p.nombre LIKE CONCAT ('%',:nombre,'%') "
			+ "AND p.precio LIKE CONCAT ('%',:precio,'%') or :precio is null ) ")
	 		List<PostreDTO> obtenerRolPorUsernamePassword(
					  @Param("id") String id,
					  @Param("nombre") String nombre,
					  @Param("precio") String precio);
}
