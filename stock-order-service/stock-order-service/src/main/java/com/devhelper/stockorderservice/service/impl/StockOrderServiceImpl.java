package com.devhelper.stockorderservice.service.impl;

import com.devhelper.stockorderservice.entity.StockCalculation;
import com.devhelper.stockorderservice.entity.StockOrder;
import com.devhelper.stockorderservice.feignProxy.StockCalculationProxy;
import com.devhelper.stockorderservice.repository.StockOrderRepository;
import com.devhelper.stockorderservice.service.StockOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class StockOrderServiceImpl implements StockOrderService {

    private final StockCalculationProxy stockCalculationProxy;
    private final StockOrderRepository stockOrderRepository;

    @Override
    public StockOrder placeStockOrder(String userId,String stockName, int stockQty) {
        StockCalculation stockCalculation = stockCalculationProxy.fetchStockDetails(stockName, stockQty).getBody();
        StockOrder stockOrder=new StockOrder();
        stockOrder.setStockId(stockCalculation.getStockId());
        stockOrder.setStockName(stockName);
        stockOrder.setStockPrice(stockCalculation.getStockPrice());
        stockOrder.setStockQty(stockQty);
        stockOrder.setTotalStockPrice(stockCalculation.getTotalStockPrice());
        stockOrder.setTrDate(LocalDateTime.now());
        stockOrder.setTrType("Buy");
        stockOrder.setUserId(userId);
        return stockOrderRepository.save(stockOrder);
    }
}
