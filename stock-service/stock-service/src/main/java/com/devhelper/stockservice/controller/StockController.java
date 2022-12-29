package com.devhelper.stockservice.controller;

import com.devhelper.stockservice.entity.Stock;
import com.devhelper.stockservice.exception.StockNotFound;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StockController {

    ResponseEntity<Stock> addNewStock(@RequestBody Stock stock);

    ResponseEntity<List<Stock>> fetchAllStocks();

    ResponseEntity<Stock> fetchStockById(@PathVariable Long stockId) throws StockNotFound;

    ResponseEntity<Stock> fetchStockByName(@PathVariable String stockName) throws StockNotFound;

    ResponseEntity<Stock> updateStock(@RequestBody Stock stock, @PathVariable Long stockId) throws StockNotFound;

    ResponseEntity<String> deleteStock(@PathVariable Long stockId);
}
