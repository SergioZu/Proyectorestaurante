package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sergio.restaurante.DTO.SalasOcupadasDTO;
import com.sergio.restaurante.entities.SalasOcupadasEntity;



@Repository
public interface SalasOcupadas extends CrudRepository<SalasOcupadasEntity, Integer>{

	@Query(value = "select new com.sergio.restaurante.dtos.SalasOcupadasDTO (so.id,so.nombre,so.nombreOcupante) "
			+ "FROM com.sergio.colegio.entities.SalasOcupadasEntity so "
			+ "WHERE (so.id LIKE CONCAT('%',:id,'%') or :id is null)"
			+ "AND so.nombre LIKE CONCAT ('%',:nombre,'%')"
			+ "AND so.nombre LIKE CONCAT ('%',:nombreOcupante,'%')")
	 		List<SalasOcupadasDTO>  obtenerSalasOcupadasPorIDNombreNombreOucpante(
					  @Param("id") int id,
					  @Param("nombre") String nombre,
					  @Param("nombreOcupante") String nombreOcupante);
}
