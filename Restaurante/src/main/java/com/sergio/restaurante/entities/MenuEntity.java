package com.sergio.restaurante.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="menu")
public class MenuEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	
	@JoinColumn(name = "id_entrantes")
	private Integer id_entrantes;
	
	@JoinColumn(name = "id_platosprincipal")
	private Integer id_platosprincipal;
	
	@JoinColumn(name = "id_platosecundario")
	private Integer id_platosecundario;
	
	
	@JoinColumn(name = "id_postre")
	private Integer id_postre;
	
	
	@JoinColumn(name = "id_bebidas")
	private Integer id_bebidas;
	
	@Column(name = "precio")
	private Integer precio;
	

	public MenuEntity() {
		super();
	}
	
	

	public MenuEntity(Integer id) {
		super();
		this.id = id;
	}



	public MenuEntity(Integer id, Integer id_entrantes, Integer id_platosprincipal, Integer id_platosecundario,
			Integer id_postre, Integer id_bebidas, Integer precio) {
		super();
		this.id = id;
		this.id_entrantes = id_entrantes;
		this.id_platosprincipal = id_platosprincipal;
		this.id_platosecundario = id_platosecundario;
		this.id_postre = id_postre;
		this.id_bebidas = id_bebidas;
		this.precio = precio;
	}



	public MenuEntity(Integer id_entrantes, Integer id_platosprincipal, Integer id_platosecundario, Integer id_postre,
			Integer id_bebidas, Integer precio) {
		super();
		this.id_entrantes = id_entrantes;
		this.id_platosprincipal = id_platosprincipal;
		this.id_platosecundario = id_platosecundario;
		this.id_postre = id_postre;
		this.id_bebidas = id_bebidas;
		this.precio = precio;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getId_entrantes() {
		return id_entrantes;
	}



	public void setId_entrantes(Integer id_entrantes) {
		this.id_entrantes = id_entrantes;
	}



	public Integer getId_platosprincipal() {
		return id_platosprincipal;
	}



	public void setId_platosprincipal(Integer id_platosprincipal) {
		this.id_platosprincipal = id_platosprincipal;
	}



	public Integer getId_platosecundario() {
		return id_platosecundario;
	}



	public void setId_platosecundario(Integer id_platosecundario) {
		this.id_platosecundario = id_platosecundario;
	}



	public Integer getId_postre() {
		return id_postre;
	}



	public void setId_postre(Integer id_postre) {
		this.id_postre = id_postre;
	}



	public Integer getId_bebidas() {
		return id_bebidas;
	}



	public void setId_bebidas(Integer id_bebidas) {
		this.id_bebidas = id_bebidas;
	}



	public Integer getPrecio() {
		return precio;
	}



	public void setPrecio(Integer precio) {
		this.precio = precio;
	}



	
	
}
