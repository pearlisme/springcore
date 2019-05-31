package com.pearl.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    AsyncService service;

    @GetMapping("/hello")
    public String sayHello(){

        System.out.println("OUTER THREAD : "+ Thread.currentThread().getName());

        service.sayHello();
        service.sayHello();
        service.sayHello();

        return "Hello!";
    }
}
