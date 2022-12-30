package com.devhelper.stockordercalculationservice.controller.impl;

import com.devhelper.stockordercalculationservice.controller.StockCalculationController;
import com.devhelper.stockordercalculationservice.entity.StockCalculation;
import com.devhelper.stockordercalculationservice.service.StockCalculationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StockCalculationControllerImpl implements StockCalculationController {

    private static final Logger LOGGER= LoggerFactory.getLogger(StockCalculationControllerImpl.class);
    private final StockCalculationService stockCalculationService;

    @GetMapping("/stock-details/{stockName}/{stockQty}")
    @Override
    public ResponseEntity<StockCalculation> stockDetails(String stockName, int stockQty) {
        StockCalculation stockCalculation = stockCalculationService.stockDetails(stockName, stockQty);
        LOGGER.info("in stock calculation service = {}, {}",stockCalculation.getStockName(),stockCalculation.getStockId());
        return ResponseEntity.ok(stockCalculation);
    }
}
