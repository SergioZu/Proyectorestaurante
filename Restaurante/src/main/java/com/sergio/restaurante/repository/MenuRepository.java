package com.sergio.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sergio.restaurante.DTO.MenuDTO;
import com.sergio.restaurante.entities.MenuEntity;

public interface MenuRepository extends CrudRepository<MenuEntity, Integer>{

	@Query(value = "select new com.sergio.restaurante.DTO.MenuDTO (m.id,e.id,pp.id,sp.id,po.id,b.id,m.precio) "
			+ "FROM com.sergio.restaurante.entities.MenuEntity m JOIN com.sergio.restaurante.entities.EntranteEntity e ON m.entrante.id = e.id "
			+ "JOIN com.sergio.restaurante.entities.PrimerPlatoEntity pp ON m.primerplato.id = pp.id "
			+ "JOIN com.sergio.restaurante.entities.SegundoPlatoEntity sp ON m.segundoplato.id = sp.id "
			+ "JOIN com.sergio.restaurante.entities.PostreEntity po ON m.postre.id = po.id "
			+ "JOIN com.sergio.restaurante.entities.BebidasEntity b ON m.bebida.id = b.id "
			+ "WHERE (e.id LIKE CONCAT('%',:idEntrante,'%') or :idEntrante is null) "
			+ "AND (pp.id LIKE CONCAT('%',:idPrimerPlato,'%') or :idPrimerPlato is null) "
			+ "AND (sp.id LIKE CONCAT('%',:idSegundoPlato,'%') or :idSegundoPlato is null) "
			+ "AND (po.id LIKE CONCAT('%',:idPostre,'%') or :idPostre is null) "
			+ "AND (b.id LIKE CONCAT('%',:idBebida,'%') or :idBebida is null) "
			+ "AND (m.precio LIKE CONCAT ('%',:precio,'%') or :precio is null ) ")
	 		List<MenuDTO> obtenerMenuPorIDsPrecio(
					  @Param("idEntrante") int idEntrante,
					  @Param("idPrimerPlato") int idPrimerPlato,
					  @Param("idSegundoPlato") int idSegundoPlato,
					  @Param("idPostre") int idPostre,
					  @Param("idBebida") int idBebida,
					  @Param("precio") int precio);
}
