package com.sergio.entities;

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
	
	
	@Column(name = "nombreOcupante")
	private String nombreOcupante;


	public SalasOcupadasEntity() {
		super();
	}


	public SalasOcupadasEntity(int id, String nombre, String nombreOcupante) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombreOcupante = nombreOcupante;
	}


	public SalasOcupadasEntity(String nombre, String nombreOcupante) {
		super();
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
