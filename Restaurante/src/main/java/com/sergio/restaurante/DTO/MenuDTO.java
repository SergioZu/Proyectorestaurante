package com.sergio.restaurante.DTO;

public class MenuDTO {
	

	private Integer id;
	private Integer id_entrantes;
	private Integer id_platosprincipal;
	private Integer id_platosecundario;
	private Integer id_postre;
	private Integer id_bebidas;
	private Integer id_salas;
	private Integer precio;
	
	
	public MenuDTO() {
		super();
	}
	
	public MenuDTO(Integer id) {
		super();
		this.id = id;
	}

	public MenuDTO(Integer id, Integer id_entrantes, Integer id_platosprincipal, Integer id_platosecundario,
			Integer id_postre, Integer id_bebidas, Integer id_salas, Integer precio) {
		super();
		this.id = id;
		this.id_entrantes = id_entrantes;
		this.id_platosprincipal = id_platosprincipal;
		this.id_platosecundario = id_platosecundario;
		this.id_postre = id_postre;
		this.id_bebidas = id_bebidas;
		this.id_salas = id_salas;
		this.precio = precio;
	}

	public MenuDTO(Integer id_entrantes, Integer id_platosprincipal, Integer id_platosecundario, Integer id_postre,
			Integer id_bebidas, Integer id_salas, Integer precio) {
		super();
		this.id_entrantes = id_entrantes;
		this.id_platosprincipal = id_platosprincipal;
		this.id_platosecundario = id_platosecundario;
		this.id_postre = id_postre;
		this.id_bebidas = id_bebidas;
		this.id_salas = id_salas;
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

	public Integer getId_salas() {
		return id_salas;
	}

	public void setId_salas(Integer id_salas) {
		this.id_salas = id_salas;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	




	
	
}
