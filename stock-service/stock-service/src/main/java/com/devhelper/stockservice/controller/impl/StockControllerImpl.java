package com.devhelper.stockservice.controller.impl;

import com.devhelper.stockservice.controller.StockController;
import com.devhelper.stockservice.entity.Stock;
import com.devhelper.stockservice.exception.StockNotFound;
import com.devhelper.stockservice.service.StockService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StockControllerImpl implements StockController {

    private static final Logger LOGGER= LoggerFactory.getLogger(StockControllerImpl.class);

    private final StockService stockService;

    @PostMapping("/stock")
    @Override
    public ResponseEntity<Stock> addNewStock(Stock stock) {
        Stock stockResponse = stockService.addNewStock(stock);
        return ResponseEntity.created(null).body(stockResponse);
    }

    @GetMapping("/stocks")
    @Override
    public ResponseEntity<List<Stock>> fetchAllStocks() {
        List<Stock> stockList = stockService.fetchAllStock();
        return ResponseEntity.ok(stockList);
    }

    @GetMapping("/stock/id/{stockId}")
    @Override
    public ResponseEntity<Stock> fetchStockById(Long stockId) throws StockNotFound {
        Optional<Stock> stockResponse = stockService.fetchStockById(stockId);
        if(stockResponse.isPresent())
            return ResponseEntity.ok(stockResponse.get());
        else
            throw new StockNotFound("Stock not found : "+stockId);
    }

    @GetMapping("/stock/name/{stockName}")
    @Override
    public ResponseEntity<Stock> fetchStockByName(String stockName) throws StockNotFound {
        Optional<Stock> stockResponse = stockService.fetchStockByName(stockName);
        if(stockResponse.isPresent()) {
            LOGGER.info("in stock service controller response= {}",stockResponse.get().getName());
            return ResponseEntity.ok(stockResponse.get());
        }else {
            throw new StockNotFound("Stock not found : " + stockName);
        }
    }

    @PatchMapping("/stock/{stockId}")
    @Override
    public ResponseEntity<Stock> updateStock(Stock stock, Long stockId) throws StockNotFound {
        Stock stockResponse=stockService.updateStock(stock,stockId);
        return ResponseEntity.ok(stockResponse);
    }

    @DeleteMapping("/stock/{stockId}")
    @Override
    public ResponseEntity<String> deleteStock(Long stockId) {
        String reponse=stockService.deleteStock(stockId);
        return ResponseEntity.ok(reponse);
    }
}
