package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sergio.restaurante.DTO.MenuDTO;
import com.sergio.restaurante.entities.MenuEntity;

public interface MenuRepository extends CrudRepository<MenuEntity, Integer>{

	@Query(value = "select new com.sergio.restaurante.DTO.MenuDTO (m.id,m.id_entrantes,m.id_platosprincipal,m.id_platosecundario,m.id_postre,m.id_bebidas,m.precio) "
			+ "FROM com.sergio.restaurante.entities.MenuEntity m JOIN com.sergio.restaurante.entities.EntranteEntity e ON m.id_entrantes = e.id "
			+ "JOIN com.sergio.restaurante.entities.PrimerPlatoEntity pp ON m.id_platosprincipal = pp.id "
			+ "JOIN com.sergio.restaurante.entities.SegundoPlatoEntity sp ON m.id_platosecundario = sp.id "
			+ "JOIN com.sergio.restaurante.entities.PostreEntity po ON m.id_postre = po.id "
			+ "JOIN com.sergio.restaurante.entities.BebidasEntity b ON m.id_bebidas = b.id "
			
			+ "WHERE (m.id LIKE CONCAT('%',:id,'%') or :id is null) "
			+ "AND (m.id_entrantes LIKE CONCAT('%',:id_entrantes,'%') or :id_entrantes is null) "
			+ "AND (m.id_platosprincipal LIKE CONCAT('%',:id_platosprincipal,'%') or :id_platosprincipal is null) "
			+ "AND (m.id_platosecundario LIKE CONCAT('%',:id_platosecundario,'%') or :id_platosecundario is null) "
			+ "AND (m.id_postre LIKE CONCAT('%',:id_postre,'%') or :id_postre is null) "
			+ "AND (m.id_bebidas LIKE CONCAT('%',:id_bebidas,'%') or :id_bebidas is null) "
			+ "AND (m.precio LIKE CONCAT ('%',:precio,'%') or :precio is null ) ")
	
			List<MenuDTO> obtenerMenuPorIDsPrecio(
						 @Param("id") int id,
					  @Param("id_entrantes") int id_entrantes,
					  @Param("id_platosprincipal") int id_platosprincipal,
					  @Param("id_platosecundario") int id_platosecundario,
					  @Param("id_postre") int id_postre,
					  @Param("id_bebidas") int id_bebidas,
					  @Param("precio") int precio);
	

	
}
