package com.sergio.restaurante.DTO;

public class MenuDTO {

	private Integer id;
	private Integer idEntrante;
	private Integer idPrimerPlato;
	private Integer idSegundoPlato;
	private Integer idPostre;
	private Integer idBebida;
	private Integer precio;
	
	
	
	
	public MenuDTO() {
		super();
	}
	
	

	public MenuDTO(Integer id) {
		super();
		this.id = id;
	}



	public MenuDTO(Integer id, Integer idEntrante, Integer idPrimerPlato, Integer idSegundoPlato, Integer idPostre,
			Integer idBebida, Integer precio) {
		super();
		this.id = id;
		this.idEntrante = idEntrante;
		this.idPrimerPlato = idPrimerPlato;
		this.idSegundoPlato = idSegundoPlato;
		this.idPostre = idPostre;
		this.idBebida = idBebida;
		this.precio = precio;
	}

	public MenuDTO(Integer idEntrante, Integer idPrimerPlato, Integer idSegundoPlato, Integer idPostre,
			Integer idBebida, Integer precio) {
		super();
		this.idEntrante = idEntrante;
		this.idPrimerPlato = idPrimerPlato;
		this.idSegundoPlato = idSegundoPlato;
		this.idPostre = idPostre;
		this.idBebida = idBebida;
		this.precio = precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdEntrante() {
		return idEntrante;
	}

	public void setIdEntrante(Integer idEntrante) {
		this.idEntrante = idEntrante;
	}

	public Integer getIdPrimerPlato() {
		return idPrimerPlato;
	}

	public void setIdPrimerPlato(Integer idPrimerPlato) {
		this.idPrimerPlato = idPrimerPlato;
	}

	public Integer getIdSegundoPlato() {
		return idSegundoPlato;
	}

	public void setIdSegundoPlato(Integer idSegundoPlato) {
		this.idSegundoPlato = idSegundoPlato;
	}

	public Integer getIdPostre() {
		return idPostre;
	}

	public void setIdPostre(Integer idPostre) {
		this.idPostre = idPostre;
	}

	public Integer getIdBebida() {
		return idBebida;
	}

	public void setIdBebida(Integer idBebida) {
		this.idBebida = idBebida;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
	
	
}
