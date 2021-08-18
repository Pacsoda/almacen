package com.microservicios.app.pedidos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.app.pedidos.models.entity.Pedido;
import com.microservicios.app.pedidos.services.PedidoService;
import com.microservicios.commons.controllers.CommonController;
import com.microservicios.commons.tazas.models.entity.Taza;

@RestController
public class PedidoController extends CommonController<Pedido, PedidoService>{

	@PutMapping("/{id}/asignar-taza")
	public ResponseEntity<?> asignarTazas(@RequestBody List<Taza> tazas, @PathVariable Long id){
		Optional<Pedido> p = this.service.findById(id);
		if(!p.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Pedido dbPedido = p.get();
		tazas.forEach(t ->{
			dbPedido.addTazas(t);
		});
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbPedido));
	}
	
	@PutMapping("/{id}/eliminar-taza")
	public ResponseEntity<?> elimTaza(@RequestBody Taza taza, @PathVariable Long id){
		Optional<Pedido> p = this.service.findById(id);
		if(!p.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Pedido dbPedido = p.get();
		
		dbPedido.removeTaza(taza);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbPedido));
	}

}
