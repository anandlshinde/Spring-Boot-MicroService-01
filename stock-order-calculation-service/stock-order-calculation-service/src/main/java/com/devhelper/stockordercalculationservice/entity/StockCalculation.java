package com.devhelper.stockordercalculationservice.entity;

import lombok.Data;

@Data
public class StockCalculation {

    private Long stockId;
    private String stockName;
    private int stockQty;
    private Double stockPrice;
    private Double totalStockPrice;
}
