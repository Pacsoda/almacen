package com.microservicios.app.pedidos.services;


import org.springframework.stereotype.Service;

import com.microservicios.app.pedidos.models.entity.Pedido;
import com.microservicios.app.pedidos.models.repository.PedidoRepository;
import com.microservicios.commons.services.CommonServiceImplement;
@Service
public class PedidoServieImplement extends CommonServiceImplement<Pedido, PedidoRepository> implements PedidoService {

}
