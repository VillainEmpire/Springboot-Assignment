package com.geekster.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"componentScanTest"})
public class CustomConfiguration {
    @Bean("Game")
    public Student getStudent1(){
        System.out.println("Spring call in config bean of student.");
        return new Student("Villain");
    }
    @Bean("Real")
    @Lazy
    public Student getStudent2(){
        System.out.println("Spring call in config bean of student.");
        return new Student("Vipin");
    }

}
