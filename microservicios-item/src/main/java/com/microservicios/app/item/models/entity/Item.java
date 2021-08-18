package com.microservicios.app.item.models.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.microservicios.commons.tazas.models.entity.Taza;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long cantidad;

	@OneToOne(fetch = FetchType.LAZY)
	private Taza taza;
	
	public Item() {
		this.taza = new Taza();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Taza getTaza() {
		return taza;
	}

	public void setTaza(Taza taza) {
		this.taza = taza;
	}

}
