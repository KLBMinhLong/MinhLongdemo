package com.example.MinhLongdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.MinhLongdemo.model.Student;

import org.springframework.ui.Model;


@Controller
public class HomeController {
    @GetMapping("/home")
    public String index() {
        return "index";
    }   
    @GetMapping("/demo")
    public String demoPage(Model model){
        Student student = new Student(1, "Minh Long");
        model.addAttribute("student", student);
        model.addAttribute("message", "Hello from Minh Long Demo!");
        return "demo";
    }
    }
    

