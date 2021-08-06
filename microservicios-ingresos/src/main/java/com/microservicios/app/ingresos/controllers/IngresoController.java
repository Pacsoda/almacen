package com.microservicios.app.ingresos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.app.ingresos.models.entity.Ingreso;
import com.microservicios.app.ingresos.services.IngresoService;
import com.microservicios.commons.controllers.CommonController;

@RestController
public class IngresoController extends CommonController<Ingreso, IngresoService>{
	
	@PostMapping("/{id}")
	public ResponseEntity<?> crear(@RequestBody Ingreso ingreso,@PathVariable Long id){
		ingreso.setTaza_id(id);
		Ingreso entitydb = service.save(ingreso);
		return ResponseEntity.status(HttpStatus.CREATED).body(entitydb);
	}
	
}
