package com.example.teacherservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "STUDENT-SERVICE")
public interface Proxy {
    @GetMapping("/sample")
    public String testMethod();
}
