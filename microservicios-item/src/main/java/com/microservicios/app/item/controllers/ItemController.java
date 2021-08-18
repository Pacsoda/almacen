package com.microservicios.app.item.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.microservicios.app.item.models.entity.Item;
import com.microservicios.app.item.services.ItemService;
import com.microservicios.commons.controllers.CommonController;

@RestController
public class ItemController extends CommonController<Item, ItemService> {

}
