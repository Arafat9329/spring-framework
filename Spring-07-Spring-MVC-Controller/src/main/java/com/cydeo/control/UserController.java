package com.cydeo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping("/user")// end point of URL
    public String user (){
        return "/user/userinfo.html";// go to folder static and look over there
    }

}
