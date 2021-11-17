package dev.junior.jenkinsspringdocker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello World";
    }

}
