package com.example.FirstProject;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        System.out.println("Hello");
        return "Greetings from Spring Boot!";
    }

}
