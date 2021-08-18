package com.microservicios.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.microservicios.commons.tazas.models.entity",
			"com.microservicios.app.item.models.entity"})
public class MicroserviciosItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosItemApplication.class, args);
	}

}
