package com.devhelper.stockordercalculationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {

    private Long id;
    private String name;
    private Double price;
}
