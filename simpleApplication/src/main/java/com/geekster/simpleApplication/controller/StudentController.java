package com.geekster.simpleApplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    public String getStudentInfo(){

        return"This is info about Student.";
    }

    @PostMapping(value = "/student")
    public String saveStudent(){
        return "This is post mapping";
    }

    @PutMapping(value = "/student")
    public String updateStudent(){
        return "This  is put mapping.";
    }

    @DeleteMapping(value = "/student")
    public String deleteStudent(){
        return "This is delete mapping.";
    }


}
