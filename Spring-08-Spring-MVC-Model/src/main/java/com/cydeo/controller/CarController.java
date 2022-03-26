package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car") //http://localhost:8080/car
public class CarController {

    @RequestMapping("/info")    //http://localhost:8080/car/info?make=Honda
    public String carInfo(@RequestParam String make, Model model){

        System.out.println(make);
        model.addAttribute("make",make);

        return "car/car-info";
    }
}
