package com.sergio.restaurante.DAO;

import java.util.List;



public interface SalasDisponibleDTO {

	List<SalasDisponibleDTO> visualizarBebidas(int id, String nombre, int precio);
	Integer insertarNuevaBebida(int id,String nombre,int precio);
	Integer modificarBebida(int id,String nombre,int precio);
	Integer eliminarBebida(int id);
}
