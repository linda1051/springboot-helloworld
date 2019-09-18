package com.example.springboothelloworld.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloWorldController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("hello2")
    public List<String> getList(){
        return Arrays.asList(new String[]{"how", "are", "you"});
    }
}
