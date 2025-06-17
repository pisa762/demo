package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//ogogksodkos
@Controller
public class FirstController{
    @GetMapping("/")
    public String first(){
        return "first";
    }
}
