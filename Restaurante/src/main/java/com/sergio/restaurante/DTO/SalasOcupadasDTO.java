package com.sergio.restaurante.DTO;

public class SalasOcupadasDTO {

	private int id;
	private String nombre;
	private String nombreOcupante;
	
	public SalasOcupadasDTO(int id, String nombre, String nombreOcupante) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombreOcupante = nombreOcupante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreOcupante() {
		return nombreOcupante;
	}

	public void setNombreOcupante(String nombreOcupante) {
		this.nombreOcupante = nombreOcupante;
	}
	
	
}
