package com.microservicios.app.ingresos.models.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.microservicios.commons.tazas.models.entity.Taza;

@Entity
@Table(name="ingresos")
public class Ingreso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date fecha;
	private Long cantidad;
	private Long taza_id;
	
	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "taza_id", referencedColumnName = "id")
	private Taza taza;*/
	
	@PrePersist
	public void prePersist() {
		this.fecha = new Date();
	}
	
	public Ingreso() {
		//this.taza = new Taza();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Long getTaza_id() {
		return taza_id;
	}

	public void setTaza_id(Long taza_id) {
		this.taza_id = taza_id;
	}

	/*public Taza getTaza() {
		return taza;
	}

	public void setTaza(Taza taza) {
		this.taza = taza;
	}*/
	
	

	
	
	
	
	

}
