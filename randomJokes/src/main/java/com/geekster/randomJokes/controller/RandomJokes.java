package com.geekster.randomJokes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RandomJokes {
   static ArrayList<String> jokesList = new ArrayList<>();

    @PostMapping(value = "/Jokes")
    public String addJokes(@RequestBody String jokes){
        jokesList.add(jokes);
        return "joke added successfully in the arraylist.";

    }
    @GetMapping(value = "/Jokes")
    public  String getJokes(){
        /*
        jokesList.add("What do kids play when their mom is using the phone?"+"\n"+" Bored games.");
        jokesList.add("What do you call an ant who fights crime?"+"\n"+" A vigilANTe!");
        jokesList.add(" What’s the smartest insect?"+"\n"+" A spelling bee!");
        jokesList.add("What is fast, loud and crunchy?"+"\n"+" A rocket chip.");
        */
        jokesList.add(" Name the kind of tree you can hold in your hand?"+"\n"+" A palm tree!");

        int randomnumber = 0+(int)(Math.random() *((4-0)+1));
        return jokesList.get(randomnumber);
    }

}
