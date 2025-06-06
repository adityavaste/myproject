package com.example.myproject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {
    @GetMapping("/flights")


    public String getData() {return "please book your flights ticket";};

}
