package com.example.cardemo.web.controllers;

import com.example.cardemo.service.models.CarServiceModel;
import com.example.cardemo.service.services.CarService;
import com.example.cardemo.web.models.CreateView;
import com.example.cardemo.web.models.DetailsView;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    private final CarService carService;
    private final ModelMapper modelMapper;

    @Autowired
    public CarController(CarService carService, ModelMapper modelMapper) {
        this.carService = carService;
        this.modelMapper = modelMapper;
    }


    @GetMapping("/create")
    public ModelAndView create(){
        return new ModelAndView("/create");
    }

    @GetMapping("/all")
    public ModelAndView getAll(ModelAndView modelAndView){
        List<DetailsView> allCars = carService.getAllCars()
                .stream().map(car -> modelMapper.map(car, DetailsView.class)).collect(Collectors.toList());

        modelAndView.addObject("cars", allCars);
        modelAndView.setViewName("all.html");

        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createConfirm(@ModelAttribute CreateView view){
        CarServiceModel carServiceModel = carService.AddCar(modelMapper.map(view, CarServiceModel.class));
        System.out.println(carServiceModel.getId());
        return new ModelAndView("redirect:/");
    }
}
