package com.sergio.restaurante.DAO;

import java.util.List;

import com.sergio.restaurante.DTO.SalasDisponibleDTO;



public interface SalasDisponibleDAO {

	List<SalasDisponibleDTO> visualizarSalasDisponible(int id, String nombre);
	Integer insertarNuevaSalasDisponible(int id,String nombre);
	Integer modificarSalasDisponible(int id,String nombre);
	Integer eliminarSalasDisponible(int id);
}
