package com.geekster.UserManagementSystem.Controller;
import com.geekster.UserManagementSystem.Model.User;

import com.geekster.UserManagementSystem.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping(value = "/getUser/{userId}")
    public User getUserById(@PathVariable("userId") int userId) {
        return userService.getUserById(userId);
    }

    @GetMapping(value = "/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping(value = "/updateUserInfo/{userId}")
    public User updateUserById(@PathVariable("userId") int userId, @RequestBody User user) {
        return userService.updateUserById(userId, user);
    }

    @DeleteMapping(value = "/deleteUser/{userId}")
    public boolean deleteUserById(@PathVariable("userId") int userId) {
        return userService.deleteUserById(userId);
    }
}


