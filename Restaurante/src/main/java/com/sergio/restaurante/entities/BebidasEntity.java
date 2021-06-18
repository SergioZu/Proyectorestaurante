package com.sergio.restaurante.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bebidas")
public class BebidasEntity {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private int precio;

	public BebidasEntity() {
		super();
	}

	
	public BebidasEntity(int id) {
		super();
		this.id = id;
	}


	public BebidasEntity(int id, String nombre, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public BebidasEntity(String nombre, int precio) {
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
