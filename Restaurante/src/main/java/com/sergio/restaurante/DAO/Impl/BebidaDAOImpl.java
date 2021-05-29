package com.sergio.restaurante.DAO.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.restaurante.DAO.BebidasDAO;
import com.sergio.restaurante.DTO.BebidasDTO;
import com.sergio.restaurante.repository.BebidasRepository;

@Service
public class BebidaDAOImpl implements BebidasDAO{
	
	@Autowired 
	private BebidasRepository bebidas;

	@Override
	public List<BebidasDTO> visualizarBebidas(int id, String nombre, int precio) {
		// TODO Auto-generated method stub
		return bebidas.obtenerBebidasPorIDNombrePrecio(id, nombre, precio);
	}

	@Override
	public Integer insertarNuevaBebida(int id, String nombre, int precio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer modificarBebida(int id, String nombre, int precio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer eliminarBebida(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
