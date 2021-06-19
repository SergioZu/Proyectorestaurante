package com.sergio.restaurante.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salas")
public class SalasEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "disponible")
	private Boolean disponible;

	public SalasEntity() {
		super();
	}
	
	

	public SalasEntity(int id) {
		super();
		this.id = id;
	}



	public SalasEntity(int id, String nombre, Boolean disponible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.disponible = disponible;
	}

	public SalasEntity(String nombre, Boolean disponible) {
		super();
		this.nombre = nombre;
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

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	
	

}
