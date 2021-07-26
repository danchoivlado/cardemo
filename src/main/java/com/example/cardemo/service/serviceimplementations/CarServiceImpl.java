package com.example.cardemo.service.serviceimplementations;

import com.example.cardemo.data.models.Car;
import com.example.cardemo.data.repositories.CarRepository;
import com.example.cardemo.service.models.CarServiceModel;
import com.example.cardemo.service.services.CarService;
import com.example.cardemo.web.models.DetailsView;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CarServiceImpl(CarRepository carRepository, ModelMapper modelMapper) {
        this.carRepository = carRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CarServiceModel AddCar(CarServiceModel model) {
        Car car = modelMapper.map(model, Car.class);
        Car addedCar = carRepository.save(car);
        model.setId(addedCar.getId());
        return model;
    }

    @Override
    public List<CarServiceModel> getAllCars() {
        var cars = carRepository.findAll().stream()
                .map(x -> modelMapper.map(x, CarServiceModel.class)).collect(Collectors.toList());
        return cars;
    }
}
