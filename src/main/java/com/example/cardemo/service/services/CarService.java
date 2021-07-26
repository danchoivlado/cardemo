package com.example.cardemo.service.services;

import com.example.cardemo.service.models.CarServiceModel;
import com.example.cardemo.service.serviceimplementations.CarServiceImpl;
import com.example.cardemo.web.models.DetailsView;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarService {
    CarServiceModel AddCar(CarServiceModel carService);
    List<CarServiceModel> getAllCars();
}
