package com.solt.jdc.affablebeantest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String welcome(Model model){
        model.addAttribute("tagline","Hello MVC Admin");
        return "home";
    }
}
