package com.devhelper.stockservice.repository;

import com.devhelper.stockservice.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {

    Optional<Stock> findByName(String name);
}
