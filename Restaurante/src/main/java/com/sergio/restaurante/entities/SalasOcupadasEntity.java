package com.sergio.restaurante.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salasocupadas")
public class SalasOcupadasEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@Column(name = "nombreocupante")
	private String nombreocupante;


	public SalasOcupadasEntity() {
		super();
	}


	public SalasOcupadasEntity(int id, String nombre, String nombreocupante) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombreocupante = nombreocupante;
	}


	public SalasOcupadasEntity(String nombre, String nombreocupante) {
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
		this.nombreocupante = nombreOcupante;
	}
	
	

}
