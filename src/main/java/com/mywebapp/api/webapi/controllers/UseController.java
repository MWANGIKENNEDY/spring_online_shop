package com.mywebapp.api.webapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UseController {
    
    
    @RequestMapping(value="/")
    @ResponseBody
    public String helloWorld(){
        return "Hello world";
    }
    
}
