package com.sergio.restaurante.DTO;

public class SalasOcupadasDTO {

	private int id;
	private String nombre;
	private String nombreocupante;
	
	public SalasOcupadasDTO(int id, String nombre, String nombreocupante) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombreocupante = nombreocupante;
	}
	
	

	public SalasOcupadasDTO(String nombre, String nombreocupante) {
		super();
		this.nombre = nombre;
		this.nombreocupante = nombreocupante;
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
		return nombreocupante;
	}

	public void setNombreOcupante(String nombreOcupante) {
		this.nombreocupante = nombreocupante;
	}
	
	
}
