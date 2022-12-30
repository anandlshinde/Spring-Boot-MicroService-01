package com.devhelper.stockorderservice.controller;

import com.devhelper.stockorderservice.entity.StockOrder;
import com.devhelper.stockorderservice.entity.StockOrderRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface StockOrderController {

    ResponseEntity<StockOrder> placedStockOrder(@RequestBody StockOrderRequest stockOrderRequest);
}
