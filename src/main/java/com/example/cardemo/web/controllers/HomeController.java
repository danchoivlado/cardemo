package com.example.cardemo.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public ModelAndView home(){
        return new ModelAndView("/home");
    }
}
