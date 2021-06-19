package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sergio.restaurante.DTO.SalasDTO;
import com.sergio.restaurante.entities.SalasEntity;




@Repository
public interface SalasRepository extends CrudRepository<SalasEntity, Integer>{
	

	@Query(value = "select new com.sergio.restaurante.DTO.SalasDTO (sa.id,sa.nombre,sa.disponible) "
			+ "FROM com.sergio.restaurante.entities.SalasEntity sa "
			+ "WHERE (sa.id LIKE CONCAT('%',:id,'%') or :id is null) "
			+ "AND sa.nombre LIKE CONCAT ('%',:nombre,'%') "
			+ "AND sa.disponible LIKE CONCAT ('%',:disponible,'%') ")
	 		List<SalasDTO> obtenerSalasPorIDNombre(
					  @Param("id") int id,
					  @Param("nombre") String nombre,
	 				  @Param("disponible") Boolean disponible);

}
