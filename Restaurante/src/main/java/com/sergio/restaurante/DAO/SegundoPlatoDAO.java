package com.sergio.restaurante.DAO;

import java.util.List;

import com.sergio.restaurante.DTO.SegundoPlatoDTO;

public interface SegundoPlatoDAO {
	
	List<SegundoPlatoDTO> visualizarSalasOcupadas(int id, String nombre, int precio);
	Integer insertarNuevaSalasOcupadas(int id,String nombre,int precio);
	Integer modificarSalasOcupadas(int id,String nombre,int precio);
	Integer eliminarSalasOcupadas(int id);

}
