package com.microservicios.app.ingresos.services;


import org.springframework.stereotype.Service;

import com.microservicios.app.ingresos.models.entity.Ingreso;
import com.microservicios.app.ingresos.models.repository.IngresoRepository;
import com.microservicios.commons.services.CommonServiceImplement;

@Service
public class IngresoServiceImplements extends CommonServiceImplement<Ingreso, IngresoRepository> implements IngresoService {



}
