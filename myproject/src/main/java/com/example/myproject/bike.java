package com.example.myproject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bike {
    @GetMapping("/bike")


    public String getData() {return "please book your bike ticket";};

}
