package com.devhelper.stockorderservice.entity;

import lombok.Data;

@Data
public class StockOrderRequest {

    private String userId;
    private String stockName;
    private int stockQty;
}
