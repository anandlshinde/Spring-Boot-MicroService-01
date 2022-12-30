package com.devhelper.stockorderservice.service;

import com.devhelper.stockorderservice.entity.StockOrder;

public interface StockOrderService {

    StockOrder placeStockOrder(String userId,String stockName,int stockQty);
}
