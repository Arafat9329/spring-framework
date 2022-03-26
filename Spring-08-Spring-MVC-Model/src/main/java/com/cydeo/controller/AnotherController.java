package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/another")// URL end point begin  with

public class AnotherController {

    @RequestMapping("/list")//URL end point http://localhost:8080/another/list
    public String showTable(Model model) {
        List<Mentor> mentorsList = new ArrayList<>();
        mentorsList.add(new Mentor("Mike", "Smith", new Random().nextInt(100), Gender.Female));
        mentorsList.add(new Mentor("Tom", "Hanks", new Random().nextInt(100), Gender.Female));
        mentorsList.add(new Mentor("Ammy", "Bryan", new Random().nextInt(100), Gender.Female));

        model.addAttribute("mentors", mentorsList);

        return "mentor/mentor-list";

    }
}
