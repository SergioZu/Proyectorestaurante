package com.sergio.restaurante.DTO;

public class SalasDTO {
	
	private int id;
	private String nombre;
	private Boolean disponible;
	
	
	
	public SalasDTO() {
		super();
	}

	

	public SalasDTO(int id) {
		super();
		this.id = id;
	}



	public SalasDTO(String nombre, Boolean disponible) {
		super();
		this.nombre = nombre;
		this.disponible = disponible;
	}



	public SalasDTO(int id, String nombre, Boolean disponible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.disponible = disponible;
	}



	public Boolean getDisponible() {
		return disponible;
	}



	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
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
	
	

}
