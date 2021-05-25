package com.sergio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salasdisponibles")
public class SalasDisponiblesEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;

	public SalasDisponiblesEntity() {
		super();
	}

	public SalasDisponiblesEntity(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public SalasDisponiblesEntity(String nombre) {
		super();
		this.nombre = nombre;
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
