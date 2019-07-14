package com.spring.thymleaf.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ThymleafController {

    String abc= "KAALA";

@Value("${welcome.message:test}")
public String message;


@RequestMapping("/")
public String welcome(Map<String, Object> model) {

    model.put("messgae",this.message);
    return "welcome";
}

@RequestMapping("/venky")
public String display(){
   // return "Venkat Java ";
    return abc + "Venkat" ;
}
}
