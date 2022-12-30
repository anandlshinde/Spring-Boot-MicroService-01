package com.devhelper.stockorderservice.controller.impl;

import com.devhelper.stockorderservice.controller.StockOrderController;
import com.devhelper.stockorderservice.entity.StockOrder;
import com.devhelper.stockorderservice.entity.StockOrderRequest;
import com.devhelper.stockorderservice.service.StockOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StockOrderControllerImpl implements StockOrderController {

    private final StockOrderService stockOrderService;

    @PostMapping("/placed-order")
    @Override
    public ResponseEntity<StockOrder> placedStockOrder(StockOrderRequest stockOrderRequest) {
        StockOrder stockOrder = stockOrderService.placeStockOrder(stockOrderRequest.getUserId(), stockOrderRequest.getStockName(), stockOrderRequest.getStockQty());
        return ResponseEntity.created(null).body(stockOrder);
    }
}
