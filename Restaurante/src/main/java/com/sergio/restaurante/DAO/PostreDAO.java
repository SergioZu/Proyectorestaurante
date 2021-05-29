package com.sergio.restaurante.DAO;

import java.util.List;


import com.sergio.restaurante.DTO.PostreDTO;

public interface PostreDAO {
	
	List<PostreDTO> visualizarPostre(int id, String nombre, int precio);
	Integer insertarNuevaPostre(int id,String nombre,int precio);
	Integer modificarPostre(int id,String nombre,int precio);
	Integer eliminarPostre(int id);

}
