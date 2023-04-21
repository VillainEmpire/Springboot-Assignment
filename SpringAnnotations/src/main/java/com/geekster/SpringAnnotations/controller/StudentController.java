package com.geekster.SpringAnnotations.controller;

import com.geekster.SpringAnnotations.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {
    @Autowired
    @Qualifier("Game")
    Student s1;

    @ResponseBody
    @GetMapping("/student")
    public Student getStudent(){
        return s1;
    }
}
