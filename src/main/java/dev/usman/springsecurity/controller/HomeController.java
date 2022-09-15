package dev.usman.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping()
    public String home() {
        return "Hello, Home!";
    }

    @GetMapping("/user")
    public String user(){
        return "Hello, User!";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Hello, admin";
    }

}
