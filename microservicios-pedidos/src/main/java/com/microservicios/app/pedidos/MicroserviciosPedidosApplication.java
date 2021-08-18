package com.microservicios.app.pedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.microservicios.commons.tazas.models.entity",
			"com.microservicios.app.pedidos.models.entity"})
public class MicroserviciosPedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosPedidosApplication.class, args);
	}

}