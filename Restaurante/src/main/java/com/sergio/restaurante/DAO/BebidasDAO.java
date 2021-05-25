package com.sergio.restaurante.DAO;

import java.util.List;

import com.sergio.restaurante.DTO.BebidasDTO;

public interface BebidasDAO {
	List<BebidasDTO> visualizarBebidas(int id, String nombre, int precio);
	Integer insertarNuevaBebida(int id,String nombre,int precio);
	Integer modificarBebida(int id,String nombre,int precio);
	Integer eliminarBebida(int id);

}
