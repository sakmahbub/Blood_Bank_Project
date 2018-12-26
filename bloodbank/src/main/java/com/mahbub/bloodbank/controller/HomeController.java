package com.mahbub.bloodbank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping(value = "/")
    public String displayHome(){

        return "index";

    }

    @GetMapping(value = "/create-role.jsf")
    public String displayRole(){

        return "role-create";

    }


}
