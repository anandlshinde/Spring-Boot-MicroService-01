package com.devhelper.stockordercalculationservice.controller;

import com.devhelper.stockordercalculationservice.entity.StockCalculation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface StockCalculationController {

    ResponseEntity<StockCalculation> fetchStockDetails(@PathVariable String stockName,@PathVariable Integer stockQty);
}
