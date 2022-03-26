package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car") //http://localhost:8080/car
public class CarController {

    @RequestMapping("/info")    //http://localhost:8080/car/info?make=Honda&year=2015
    public String carInfo(@RequestParam(value = "make",required = true) String make,
                          Model model,
                          @RequestParam(value = "year",required = false) Integer year){

        System.out.println(make);
        System.out.println(year);
        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}")    //http://localhost:8080/car/info/honda/year
    public String getCarInfo(@PathVariable String make,
                             @PathVariable Integer year,
                             Model model){

        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info";
    }
}
