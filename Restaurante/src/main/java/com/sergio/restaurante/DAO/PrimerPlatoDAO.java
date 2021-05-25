package com.sergio.restaurante.DAO;

import java.util.List;

import com.sergio.restaurante.DTO.PrimerPlatoDTO;

public interface PrimerPlatoDAO {

	List<PrimerPlatoDTO> visualizarBebidas(int id, String nombre, int precio);
	Integer insertarNuevaBebida(int id,String nombre,int precio);
	Integer modificarBebida(int id,String nombre,int precio);
	Integer eliminarBebida(int id);
}
