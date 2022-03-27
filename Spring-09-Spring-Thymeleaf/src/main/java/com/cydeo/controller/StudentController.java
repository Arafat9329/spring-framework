package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student") //http://localhost:8080/student
public class StudentController {

    @RequestMapping("/register")//http://localhost:8080/student/register
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createdStudent());

        return "student/register";
    }

    @RequestMapping("/welcome")//http://localhost:8080/student/welcome
    public String info(Model model){
        return "student/welcome";
    }
}
