package com.sergio.restaurante.DAO;

import java.util.List;

import com.sergio.restaurante.DTO.EntranteDTO;


public interface EntranteDAO {

	List<EntranteDTO> visualizarEntrante(int id, String nombre, int precio);
	Integer insertarNuevaEntrante(int id,String nombre,int precio);
	Integer modificarEntrante(int id,String nombre,int precio);
	Integer eliminarEntrante(int id);
}
