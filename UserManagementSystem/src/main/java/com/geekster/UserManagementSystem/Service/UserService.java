package com.geekster.UserManagementSystem.Service;

import com.geekster.UserManagementSystem.Model.User;

import com.geekster.UserManagementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userDaoRepository;

    public List<User> getAllUsers() {
        return userDaoRepository.getAllUsers();
    }

    public User getUserById(int userId) {
        Optional<User> optionalUser = userDaoRepository.getUserById(userId);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            return null;
        }
    }

    public User createUser(User user) {
        int newUserId = userDaoRepository.getMaxUserId() + 1;
        user.setUserId(newUserId);
        userDaoRepository.saveUser(user);
        return user;
    }


    public User updateUserById(int userId, User user) {
        Optional<User> optionalUser = userDaoRepository.getUserById(userId);
        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();
            existingUser.setName(user.getName());
            existingUser.setUserName(user.getUserName());
            existingUser.setAddress(user.getAddress());
            existingUser.setPhoneNumber(user.getPhoneNumber());
            userDaoRepository.saveUser(existingUser);
            return existingUser;
        } else {
            return null;
        }
    }

    public boolean deleteUserById(int userId) {
        return userDaoRepository.deleteUserById(userId);
    }
}
