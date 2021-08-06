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
	
	
	/*@PostMapping("/{id}")
	public ResponseEntity<?> crear(@RequestBody Ingreso ingreso, @PathVariable Long id){
		Ingreso entitydb = service.save(ingreso);
		return ResponseEntity.status(HttpStatus.CREATED).body(entitydb);
	}*/
	
	/*@PostMapping
	public ResponseEntity<?> crear(@RequestBody Ingreso ingreso, @PathVariable Long id){
		Optional<Ingreso> op = this.service.findById(id);
		if(!op.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Ingreso ingresodb = op.get();
		ingresodb.setTazas(ingreso.getCantidad());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(ingresodb));
	}*/

	/*ya no se ocupan*/
	/*@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Ingreso ingreso, @PathVariable Long id){
		Optional<Ingreso> op = this.service.findById(id);
		if(!op.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Ingreso ingresodb = op.get();
		ingresodb.setCantidad(ingreso.getCantidad());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(ingresodb));
	}
	
	@PutMapping("/{id}/asignar-taza")
	public ResponseEntity<?> asignarTaza(@RequestBody List<Taza> tazas, @PathVariable Long id){
		Optional<Ingreso> op = this.service.findById(id);
		if(!op.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Ingreso ingresodb = op.get();
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(ingresodb));
	}
	
	@PutMapping("/{id}/eliminar-taza")
	public ResponseEntity<?> eliminarrTaza(@RequestBody Taza taza, @PathVariable Long id){
		Optional<Ingreso> op = this.service.findById(id);
		if(!op.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Ingreso ingresodb = op.get();
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(ingresodb));
	}*/
	
}
