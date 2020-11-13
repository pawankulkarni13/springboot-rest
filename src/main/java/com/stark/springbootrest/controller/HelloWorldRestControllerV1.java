package com.stark.springbootrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class HelloWorldRestControllerV1 {

    @GetMapping
    public String sayHelloV1(){
        return "Hello from World V1 !!";
    }

}
