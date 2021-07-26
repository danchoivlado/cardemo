package com.example.cardemo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanConfigurator {

    @Bean
    public ModelMapper createMapper(){
        return new ModelMapper();
    }


}
