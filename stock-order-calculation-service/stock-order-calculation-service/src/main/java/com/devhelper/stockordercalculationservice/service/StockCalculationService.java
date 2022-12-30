package com.devhelper.stockordercalculationservice.service;

import com.devhelper.stockordercalculationservice.entity.StockCalculation;

public interface StockCalculationService {

    StockCalculation stockDetails(String stockName,int stockQty);
}
