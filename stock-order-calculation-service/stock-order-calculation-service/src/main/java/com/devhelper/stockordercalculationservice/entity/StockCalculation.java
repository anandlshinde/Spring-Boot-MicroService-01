package com.devhelper.stockordercalculationservice.entity;

import lombok.Data;

@Data
public class StockCalculation {
    private String stockName;
    private Double stockPrice;
    private int stockQty;
    private Double totalStockPrice;
}
