package com.devhelper.stockserviceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StockServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockServiceEurekaServerApplication.class, args);
	}

}
