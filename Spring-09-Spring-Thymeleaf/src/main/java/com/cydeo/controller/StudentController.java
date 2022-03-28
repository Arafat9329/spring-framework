package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student") //http://localhost:8080/student// in class level we can't do this
public class StudentController {

//    @RequestMapping(value = "/register", method = RequestMethod.GET)//http://localhost:8080/student/register
    @GetMapping(value = "/register")//http://localhost:8080/student/register  this is same as above, sprint 4.3
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createdStudent());
        return "student/register";
    }

    @RequestMapping("/welcome")//http://localhost:8080/student/welcome
    public String info(Model model){
        return "student/welcome";
    }
}
