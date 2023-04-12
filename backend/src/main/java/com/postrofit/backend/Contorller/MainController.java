package com.postrofit.backend.Contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MainController {
    Environment environment;

    @Autowired
    public MainController(Environment environment) {
        this.environment = environment;
    }

    // welcome 페이지
    @GetMapping("/")
    public String welcome(){
        return "welcome s";
    }
    @GetMapping("/health")
    public String health(){
        return String.format("indexsdfasdf %s", environment.getProperty("local.server.port"));
    }




}
