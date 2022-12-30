package com.devhelper.stockordercalculationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StockOrderCalculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockOrderCalculationServiceApplication.class, args);
	}

}
