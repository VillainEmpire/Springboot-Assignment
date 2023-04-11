package com.geekster.simpleApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    @GetMapping(value="/cat")
    public String getCatInfo(){
        return "This is info about cat.";
    }
}
