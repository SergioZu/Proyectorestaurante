package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sergio.restaurante.entities.SegundoPlatoEntity;



@Repository
public interface SegundoPlatoRepository extends CrudRepository<SegundoPlatoEntity, Integer>{

	@Query(value = "select new com.sergio.restaurante.DTO.SegundoPlatoDTO (s.id,s.nombre,s.precio) "
			+ "FROM com.sergio.restaurante.entities.SegundoPlatoEntity s "
			+ "WHERE (s.id LIKE CONCAT('%',:id,'%') or :id is null) "
			+ "AND s.nombre LIKE CONCAT ('%',:nombre,'%') "
			+ "AND (s.precio LIKE CONCAT ('%',:precio,'%') or :precio is null ) ")
	 		List<SegundoPlatoEntity>obtenerSegundoPlatoPorIDNombreNombrePrecio(
					  @Param("id") int id,
					  @Param("nombre") String nombre,
					  @Param("precio") int precio);
}
