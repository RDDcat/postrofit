package com.postrofit.backend.Contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
    @GetMapping("/")
    public String welcome(){
        return "index.html";
    }



}
