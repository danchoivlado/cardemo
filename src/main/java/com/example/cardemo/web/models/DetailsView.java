package com.example.cardemo.web.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DetailsView {
    private String brand;
    private String model;
    private Integer year;
    private String engine;
}