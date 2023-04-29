package com.geekster.h2Fun.service;

import com.geekster.h2Fun.models.Users;
import com.geekster.h2Fun.repository.IUserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;
    public Iterable<Users> getAllUsers(){

       Iterable<Users> allUsers= userRepository.findAll();
       return allUsers;
    }

    public String addUsers(List<Users> usersList){
       Iterable<Users> addedUsers =  userRepository.saveAll(usersList);
       if(addedUsers!=null){
           return "Yes";

       }
       else{
           return "No";
       }

    }
    public void removeUserById(Integer id){
        userRepository.deleteById(id);
    }

    public List<Users> fetchUserByName(String name){
        return userRepository.findByName(name);
    }

    public List<Users> fetchUserByAgeFactor(String age){
        Integer UserAge = Integer.parseInt(age);
        return userRepository.findByAgeGreaterThan(UserAge);
    }
    public List<Users> getUserByNameOrAgeAbove(String name, String age){
        Integer UserAge = Integer.parseInt(age);
        return userRepository.findByNameOrAgeGreaterThan(name,UserAge);
    }

    public List<Users> getUserByNameAndAgeAbove(String name, String age){
        Integer UserAge = Integer.parseInt(age);
        return userRepository.findByNameAndAgeGreaterThan(name,UserAge);
    }
}
