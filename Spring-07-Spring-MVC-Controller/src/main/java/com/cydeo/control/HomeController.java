package com.cydeo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")//Use @RequestMapping annotation to associate the action with an HTTP request path
    public String home (){
        return "home.html";//Return the HTML document name that contains the details we want the browser to display
    }

    @RequestMapping("/welcome")// set up end point of URL
    public String home2 (){
        return "welcome.html";// where is the HTML page located
    }

    @RequestMapping()// if you don't put anything here, as default it will put  ("/")
    public String home3 (){
        return "welcome.html";
    }
}
