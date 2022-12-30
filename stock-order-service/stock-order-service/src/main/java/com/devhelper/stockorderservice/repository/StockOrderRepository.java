package com.devhelper.stockorderservice.repository;

import com.devhelper.stockorderservice.entity.StockOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOrderRepository extends JpaRepository<StockOrder,Long> {


}
