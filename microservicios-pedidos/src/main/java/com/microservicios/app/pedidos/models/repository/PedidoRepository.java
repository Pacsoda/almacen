package com.microservicios.app.pedidos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.pedidos.models.entity.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
