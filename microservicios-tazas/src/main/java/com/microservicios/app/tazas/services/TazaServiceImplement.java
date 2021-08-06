package com.microservicios.app.tazas.services;

import org.springframework.stereotype.Service;

import com.microservicios.app.tazas.models.repository.TazaRepository;
import com.microservicios.commons.services.CommonServiceImplement;
import com.microservicios.commons.tazas.models.entity.Taza;

@Service
public class TazaServiceImplement extends CommonServiceImplement<Taza, TazaRepository> implements TazaService {

	

}
