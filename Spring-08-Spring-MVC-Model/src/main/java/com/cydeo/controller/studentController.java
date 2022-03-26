package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//object -- sprint boot
public class studentController {

    @RequestMapping("/welcome")// set up the URL end point
    public String homePage(Model model){
        //model methods

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");


        return "/student/welcome";// HTML location, don't need .html because its templates file
    }

}
