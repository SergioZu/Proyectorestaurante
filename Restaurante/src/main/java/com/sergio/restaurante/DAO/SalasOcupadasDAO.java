package com.sergio.restaurante.DAO;

import java.util.List;

import com.sergio.restaurante.DTO.SalasOcupadasDTO;

public interface SalasOcupadasDAO {
	
	List<SalasOcupadasDTO> visualizarBebidas(int id, String nombre, String nombreOcupante);
	Integer insertarNuevaBebida(int id,String nombre,String nombreOcupante);
	Integer modificarBebida(int id,String nombre,String nombreOcupante);
	Integer eliminarBebida(int id);

}
