package com.devhelper.stockorderservice.feignProxy;

import com.devhelper.stockorderservice.entity.StockCalculation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STOCK-ORDER-CALCULATION-SERVICE",url = "http://localhost:8282/stock-calculation-service")
public interface StockCalculationProxy {

    @GetMapping("/stock-details/{stockName}/{stockQty}")
    ResponseEntity<StockCalculation> fetchStockDetails(@PathVariable String stockName, @PathVariable Integer stockQty);

}
