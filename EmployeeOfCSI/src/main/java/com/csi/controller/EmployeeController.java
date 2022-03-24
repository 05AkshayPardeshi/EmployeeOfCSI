package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/akshay")
public class EmployeeController {


    @GetMapping
    public String m1() {
        return "PLEASE ADD YOUR NAME IN THIS PROGARM";
    }

    @GetMapping("/akshay")
    public String akshay() {
        return "AKSHAY PARDESI..!";
    }

    

    // ADD YOUR NAME METHOD
}
