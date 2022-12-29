package com.devhelper.stockordercalculationservice.service.impl;

import com.devhelper.stockordercalculationservice.entity.Stock;
import com.devhelper.stockordercalculationservice.entity.StockCalculation;
import com.devhelper.stockordercalculationservice.feignproxy.StockServiceProxy;
import com.devhelper.stockordercalculationservice.service.StockCalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockCalculationServiceImpl implements StockCalculationService {

    private final StockServiceProxy stockServiceProxy;

    @Override
    public StockCalculation stockDetails(String stockName,Integer stockQty) {
        Stock stock = stockServiceProxy.fetchStockByName(stockName).getBody();
        StockCalculation stockCalculation=new StockCalculation();
        stockCalculation.setStockName(stockName);
        stockCalculation.setStockPrice(stock.getPrice());
        stockCalculation.setStockQty(stockQty);
        stockCalculation.setTotalStockPrice((stockQty*stock.getPrice()));
        return stockCalculation;
    }
}
