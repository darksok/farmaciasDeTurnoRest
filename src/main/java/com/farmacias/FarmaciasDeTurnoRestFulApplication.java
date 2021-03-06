package com.farmacias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.farmacias.service", "com.farmacias.controller" })
public class FarmaciasDeTurnoRestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmaciasDeTurnoRestFulApplication.class, args);
	}

}
