package com.devhelper.stockordercalculationservice.feignproxy;

import com.devhelper.stockordercalculationservice.entity.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STOCK-SERVICE", url = "http://localhost:8181/stock-service")
public interface StockServiceProxy {
    @GetMapping("/stock/name/{stockName}")
    ResponseEntity<Stock> fetchStockByName(@PathVariable String stockName);
}
