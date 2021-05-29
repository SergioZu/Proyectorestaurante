package com.sergio.restaurante.DAO;

import java.util.List;

import com.sergio.restaurante.DTO.PrimerPlatoDTO;

public interface PrimerPlatoDAO {

	List<PrimerPlatoDTO> visualizarPrimerPlato(int id, String nombre, int precio);
	Integer insertarNuevaPrimerPlato(int id,String nombre,int precio);
	Integer modificarPrimerPlato(int id,String nombre,int precio);
	Integer eliminarPrimerPlato(int id);
}
