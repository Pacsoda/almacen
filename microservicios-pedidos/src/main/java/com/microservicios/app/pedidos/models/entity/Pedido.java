package com.microservicios.app.pedidos.models.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.microservicios.commons.tazas.models.entity.Taza;

@Entity
@Table(name="pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Taza> tazas;
	
	@PrePersist
	public void prePersist(){
		this.createAt = new  Date();
	}
	
	

	public Pedido() {
		this.tazas = new ArrayList<>();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public List<Taza> getTazas() {
		return tazas;
	}

	public void setTazas(List<Taza> tazas) {
		this.tazas = tazas;
	}
	
	public void addTazas(Taza taza) {
		this.tazas.add(taza);
	}
	
	public void removeTaza(Taza taza) {
		this.tazas.remove(taza);
	}
	
	
}
