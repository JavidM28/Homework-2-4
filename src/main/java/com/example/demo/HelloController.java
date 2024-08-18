package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/calculator")
    public String hello(){
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping(path = "/calculator")
    public String answerHello(@RequestParam("name") String userName){
        return "<b>hello</b> " + userName +"!";
    }
}
