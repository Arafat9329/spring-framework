package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller//object -- sprint boot
public class studentController {

    @RequestMapping("/welcome")// set up the URL end point
    public String homePage(Model model){
        //model methods

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        //random number
        int studentID = new Random().nextInt(1000);
        model.addAttribute("randomNumber",studentID);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(4);
        model.addAttribute("numbers",numbers);

        return "/student/welcome";// HTML location, don't need .html because its templates file
    }

}
