package com.spring.controllers;


import com.spring.model.Person;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Model model){
        //        modelAttribute="person" for person page
        model.addAttribute("person", new Person());
        return "home";
    }


}
