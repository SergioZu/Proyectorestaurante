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
	@JoinColumn(name = "id_entrantes")
	private EntranteEntity entrante;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_platosprincipal")
	private PrimerPlatoEntity primerplato;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_platosecundario")
	private SegundoPlatoEntity segundoplato;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_postre")
	private PostreEntity postre;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_bebidas")
	private BebidasEntity bebida;
	
	@Column(name = "precio")
	private Integer precio;

	public MenuEntity(Integer id, EntranteEntity entrante, PrimerPlatoEntity primerplato,
			SegundoPlatoEntity segundoplato, PostreEntity postre, BebidasEntity bebida, Integer precio) {
		super();
		this.id = id;
		this.entrante = entrante;
		this.primerplato = primerplato;
		this.segundoplato = segundoplato;
		this.postre = postre;
		this.bebida = bebida;
		this.precio = precio;
	}

	public MenuEntity(EntranteEntity entrante, PrimerPlatoEntity primerplato, SegundoPlatoEntity segundoplato,
			PostreEntity postre, BebidasEntity bebida, Integer precio) {
		super();
		this.entrante = entrante;
		this.primerplato = primerplato;
		this.segundoplato = segundoplato;
		this.postre = postre;
		this.bebida = bebida;
		this.precio = precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EntranteEntity getEntrante() {
		return entrante;
	}

	public void setEntrante(EntranteEntity entrante) {
		this.entrante = entrante;
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

	public PostreEntity getPostre() {
		return postre;
	}

	public void setPostre(PostreEntity postre) {
		this.postre = postre;
	}

	public BebidasEntity getBebida() {
		return bebida;
	}

	public void setBebida(BebidasEntity bebida) {
		this.bebida = bebida;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}


	
	
	
}
