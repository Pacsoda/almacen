package com.microservicios.app.tazas.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.commons.tazas.models.entity.Taza;

public interface TazaRepository extends CrudRepository<Taza, Long> {

}
