package com.geekster.h2Fun.controller;

import com.geekster.h2Fun.models.Users;
import com.geekster.h2Fun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //get
    @GetMapping(value= "/users")
    public Iterable<Users> getUsers(){
    Iterable<Users> allUsers = userService.getAllUsers();
    return allUsers;
    }

    //Post
    @PostMapping(value = "/users")
    public String insertUsers(@RequestBody List<Users> usersList){
     return userService.addUsers(usersList);
    }

    //Delete
    @DeleteMapping(value="/user/{id}")
    // Try using int in place of Integer
    public void deleteUserById(@PathVariable Integer id){
         userService.removeUserById(id);
    }

    @GetMapping(value="users/{name}")
    public  List<Users> getUserByName(@PathVariable String name){
        return userService.fetchUserByName(name);
    }

    @GetMapping(value = "users/age/{age}")
    public List<Users> getUserByAge(@PathVariable String age){
        return userService.fetchUserByAgeFactor(age);
    }

    @GetMapping(value = "users/{name}/greaterThan/{age}")
    public List<Users> getUserByNameOrAgeAbove(@PathVariable String name, @PathVariable String age){
        return userService.getUserByNameOrAgeAbove(name,age);
    }

    @GetMapping(value = "users/{name}/greaterThan/{age}")
    public List<Users> getUserByNamAndAgeAbove(@PathVariable String name, @PathVariable String age){
        return userService.getUserByNameAndAgeAbove(name,age);
    }

}
