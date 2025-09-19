package com.example.greeting.controller;

import com.example.greeting.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {
 private final GreetingService greetingService;


    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "World", name = "name")String name){
        return greetingService.getGreetingService(name);
    }
}




