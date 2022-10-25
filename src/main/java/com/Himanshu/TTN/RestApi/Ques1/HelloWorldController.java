package com.Himanshu.TTN.RestApi.Ques1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
     @RequestMapping(method = RequestMethod.GET,path = "/hello")
    //@GetMapping(path = "/hello")
     public String HelloWorld(){
        return "Welcome to the Spring Boot";
    }



}
