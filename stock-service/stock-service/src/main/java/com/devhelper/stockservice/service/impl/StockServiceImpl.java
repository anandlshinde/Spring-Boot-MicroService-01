package com.devhelper.stockservice.service.impl;

import com.devhelper.stockservice.entity.Stock;
import com.devhelper.stockservice.exception.StockNotFound;
import com.devhelper.stockservice.repository.StockRepository;
import com.devhelper.stockservice.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;

    @Override
    public Stock addNewStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> fetchAllStock() {
        return stockRepository.findAll();
    }

    @Override
    public Optional<Stock> fetchStockById(Long stockId) {
        return stockRepository.findById(stockId);
    }

    @Override
    public Optional<Stock> fetchStockByName(String stockName) {
        return stockRepository.findByName(stockName);
    }

    @Override
    public Stock updateStock(Stock stock, Long stockId) throws StockNotFound {
        Optional<Stock> stockResponse = stockRepository.findById(stockId);
        if(stockResponse.isPresent()) {
            Stock stockUpdate = new Stock();
            stockUpdate.setId(stockId);
            stockUpdate.setName(stock.getName());
            stockUpdate.setPrice(stock.getPrice());
            return stockRepository.save(stockUpdate);
        } else{
            throw new StockNotFound("Stock not found stockId: " + stockId);
        }
    }

    @Override
    public String deleteStock(Long stockId) {
        Optional<Stock> stockResponse = stockRepository.findById(stockId);
        if(stockResponse.isPresent())
        stockRepository.deleteById(stockId);
        return "Stock deleted successfully";
    }
}
