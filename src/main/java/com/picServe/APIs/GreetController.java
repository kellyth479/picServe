package com.picServe.APIs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping(value = "/greet")
    public String greetUser(){
        return "hello world";
    }

    @GetMapping("/")
    public String root(){
        return "This is the root";
    }
    @GetMapping("/face")
    public String error(){
        return "face";
    }
}
