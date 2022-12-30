package com.devhelper.stockorderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class StockOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime trDate;
    private String userId;
    private int stockId;
    private String stockName;
    private String trType;
    private int stockQty;
    private Double stockPrice;
    private Double totalStockPrice;

}
