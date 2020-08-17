package com.example.studentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/sample")
    public String testMethod(){
        return "Hello test";
    }
}
