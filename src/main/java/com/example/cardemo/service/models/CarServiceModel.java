package com.example.cardemo.service.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarServiceModel {
    private int Id;
    private String brand;
    private String model;
    private String engine;
    private Integer year;
}
