package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"ComponetScanTest"})
public class CustomConfiguration {

    @Bean("Villain")
    public Student getStudent1()
    {
        System.out.println("Spring calll.. in config bean of student");
        return new Student("Villain");
    }

    @Bean("Manish")
    @Lazy
    public Student getStudent2()
    {
        System.out.println("Spring calll.. in config bean of student");
        return new Student("Manish");
    }

}
