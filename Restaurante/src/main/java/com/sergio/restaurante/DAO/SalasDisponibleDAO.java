package com.sergio.restaurante.DAO;

import java.util.List;



public interface SalasDisponibleDAO {

	List<SalasDisponibleDAO> visualizarBebidas(int id, String nombre);
	Integer insertarNuevaBebida(int id,String nombre);
	Integer modificarBebida(int id,String nombre);
	Integer eliminarBebida(int id);
}
