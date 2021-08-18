package com.microservicios.app.item.services;

import org.springframework.stereotype.Service;

import com.microservicios.app.item.models.entity.Item;
import com.microservicios.app.item.models.repository.ItemRepository;
import com.microservicios.commons.services.CommonServiceImplement;
@Service
public class ItemServiceImplement extends CommonServiceImplement<Item, ItemRepository> implements ItemService {

	

}
