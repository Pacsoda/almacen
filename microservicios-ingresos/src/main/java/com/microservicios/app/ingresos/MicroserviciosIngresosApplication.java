package com.microservicios.app.ingresos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.microservicios.commons.tazas.models.entity",
			"com.microservicios.app.ingresos.models.entity"})
public class MicroserviciosIngresosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosIngresosApplication.class, args);
	}

}
