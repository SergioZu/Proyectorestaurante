package com.sergio.restaurante.DTO;

public class EntranteDTO {
	private int id;
	private String nombre;
	private Integer precio;
	
	
	public EntranteDTO(int id, String nombre, Integer precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}


	public EntranteDTO(String nombre, Integer precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
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


	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	

}
