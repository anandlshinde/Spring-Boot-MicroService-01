package com.devhelper.stockorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StockOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockOrderServiceApplication.class, args);
	}

}
