package com.novlence.parking.parkingbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldComtroller {
    @GetMapping(path = "hello")
    public String HelloWorld(){
        return "Hello Gaurang!";
    }
}
