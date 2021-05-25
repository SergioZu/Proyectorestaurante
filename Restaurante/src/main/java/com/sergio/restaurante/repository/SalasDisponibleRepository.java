package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sergio.restaurante.DTO.SalasDisponibleDTO;
import com.sergio.restaurante.entities.SalasDisponiblesEntity;




@Repository
public interface SalasDisponibleRepository extends CrudRepository<SalasDisponiblesEntity, Integer>{
	

	@Query(value = "select new com.sergio.restaurante.dtos.SalasDisponibleDTO (sa.id,sa.nombre) "
			+ "FROM com.sergio.colegio.entities.SalasDisponibleEntity sa "
			+ "WHERE (sa.id LIKE CONCAT('%',:id,'%') or :id is null)"
			+ "AND sa.nombre LIKE CONCAT ('%',:nombre,'%')")
	 		List<SalasDisponibleDTO> obtenerRolPorUsernamePassword(
					  @Param("id") String id,
					  @Param("nombre") String nombre);

}
