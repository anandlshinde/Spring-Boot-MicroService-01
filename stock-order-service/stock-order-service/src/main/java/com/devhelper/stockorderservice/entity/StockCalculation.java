package com.devhelper.stockorderservice.entity;

import lombok.Data;

@Data
public class StockCalculation {
    private Long stockId;
    private String stockName;
    private Double stockPrice;
    private int stockQty;
    private Double totalStockPrice;
}
