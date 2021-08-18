package com.microservicios.app.item.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.item.models.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
