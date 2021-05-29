package com.sergio.restaurante.DAO;

import java.util.List;

import com.sergio.restaurante.DTO.SalasOcupadasDTO;

public interface SalasOcupadasDAO {
	
	List<SalasOcupadasDTO> visualizarSalasOcupadas(int id, String nombre, String nombreOcupante);
	Integer insertarNuevaSalasOcupadas(int id,String nombre,String nombreOcupante);
	Integer eliminarSalasOcupadas(int id);

}
