package com.devhelper.stockordercalculationservice.controller.impl;

import com.devhelper.stockordercalculationservice.controller.StockCalculationController;
import com.devhelper.stockordercalculationservice.entity.StockCalculation;
import com.devhelper.stockordercalculationservice.service.StockCalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StockCalculationControllerImpl implements StockCalculationController {

    private final StockCalculationService stockCalculationService;

    @GetMapping("/stock-details/{stockName}/{stockQty}")
    @Override
    public ResponseEntity<StockCalculation> fetchStockDetails(String stockName,Integer stockQty) {
        return ResponseEntity.ok(stockCalculationService.stockDetails(stockName,stockQty));
    }
}
