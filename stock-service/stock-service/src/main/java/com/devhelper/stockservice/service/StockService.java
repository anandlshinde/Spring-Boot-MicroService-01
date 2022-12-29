package com.devhelper.stockservice.service;

import com.devhelper.stockservice.entity.Stock;
import com.devhelper.stockservice.exception.StockNotFound;

import java.util.List;
import java.util.Optional;

public interface StockService {

    Stock addNewStock(Stock stock);

    List<Stock> fetchAllStock();

    Optional<Stock> fetchStockById(Long stockId);

    Optional<Stock> fetchStockByName(String stockName);

    Stock updateStock(Stock stock,Long stockId) throws StockNotFound;

    String deleteStock(Long stockId);
}
