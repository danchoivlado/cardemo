package com.example.cardemo;

import com.example.cardemo.data.repositories.CarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CardemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(CardemoApplication.class, args);
        CarRepository carRepository = ctx.getBean(CarRepository.class);


    }

}
