package com.springBootException.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HelloController {
    @GetMapping("/")
    public String getMessage(String msg) throws CustomException,IOException{
        if(msg.equalsIgnoreCase("IllegalArgument")){
            throw new IllegalArgumentException("Illegal Argument");
        }
        if(msg.equalsIgnoreCase("IOException")){
            throw new IOException("IO Exception");
        }
        if(msg.equalsIgnoreCase("Custom")){
            throw new CustomException("My custom error message");
        }
        return "Hello "+msg;
    }

}
