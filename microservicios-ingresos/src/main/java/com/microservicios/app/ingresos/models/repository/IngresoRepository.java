package com.microservicios.app.ingresos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.ingresos.models.entity.Ingreso;

public interface IngresoRepository extends CrudRepository<Ingreso, Long>{

}
