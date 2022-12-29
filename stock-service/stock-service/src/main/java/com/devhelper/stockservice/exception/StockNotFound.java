package com.devhelper.stockservice.exception;

public class StockNotFound extends Throwable {
    public StockNotFound(String message) {
        super(message);
    }
}
