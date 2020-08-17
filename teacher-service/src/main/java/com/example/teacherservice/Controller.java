package com.example.teacherservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Proxy proxy;

    public Controller(Proxy proxy){
        this.proxy = proxy;
    }

    @GetMapping("/random")
    public String testingController(){
        return proxy.testMethod();
    }
}
