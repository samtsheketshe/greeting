package com.example.greeting.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
public String getGreetingService (String name){

    return "Hello, " + name + "!";
}
}
