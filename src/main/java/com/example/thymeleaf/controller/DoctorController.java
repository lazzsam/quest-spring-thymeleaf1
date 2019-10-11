package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model1, @ RequestParam(value="name", required=false, defaultValue="John Smith") String name, Model model2, @RequestParam(value="number", required=false,defaultValue="0") String number)
    
    {
    	model1.addAttribute("name", name);
    	model2.addAttribute("number", number);
        return "doctor";
    }
}