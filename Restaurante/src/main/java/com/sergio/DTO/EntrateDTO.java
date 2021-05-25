package com.sergio.DTO;

public class EntrateDTO {
	private int id;
	private String nombre;
	private Integer precio;
	
	
	public EntrateDTO(int id, String nombre, Integer precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}


	public EntrateDTO(String nombre, Integer precio) {
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
