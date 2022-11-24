package com.postrofit.backend.Contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // welcome 페이지
    @GetMapping("/")
    public String welcome(){
        return "index.html";
    }



}
