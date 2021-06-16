package com.sergio.restaurante.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="menu")
public class MenuEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_bebidas")
	private BebidasEntity bebida;
	
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_entrantes")
	private EntranteEntity entrante;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_postre")
	private PostreEntity postre;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_platosprincipal")
	private PrimerPlatoEntity primerplato;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_platosecundario")
	private SegundoPlatoEntity segundoplato;
	
	
	@Column(name = "precio")
	private Integer precio;


	public MenuEntity(Integer id, BebidasEntity bebida, EntranteEntity entrante, PostreEntity postre,
			PrimerPlatoEntity primerplato, SegundoPlatoEntity segundoplato, Integer precio) {
		super();
		this.id = id;
		this.bebida = bebida;
		this.entrante = entrante;
		this.postre = postre;
		this.primerplato = primerplato;
		this.segundoplato = segundoplato;
		this.precio = precio;
	}


	public MenuEntity(BebidasEntity bebida, EntranteEntity entrante, PostreEntity postre, PrimerPlatoEntity primerplato,
			SegundoPlatoEntity segundoplato, Integer precio) {
		super();
		this.bebida = bebida;
		this.entrante = entrante;
		this.postre = postre;
		this.primerplato = primerplato;
		this.segundoplato = segundoplato;
		this.precio = precio;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public BebidasEntity getBebida() {
		return bebida;
	}


	public void setBebida(BebidasEntity bebida) {
		this.bebida = bebida;
	}


	public EntranteEntity getEntrante() {
		return entrante;
	}


	public void setEntrante(EntranteEntity entrante) {
		this.entrante = entrante;
	}


	public PostreEntity getPostre() {
		return postre;
	}


	public void setPostre(PostreEntity postre) {
		this.postre = postre;
	}


	public PrimerPlatoEntity getPrimerplato() {
		return primerplato;
	}


	public void setPrimerplato(PrimerPlatoEntity primerplato) {
		this.primerplato = primerplato;
	}


	public SegundoPlatoEntity getSegundoplato() {
		return segundoplato;
	}


	public void setSegundoplato(SegundoPlatoEntity segundoplato) {
		this.segundoplato = segundoplato;
	}


	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
	
}
