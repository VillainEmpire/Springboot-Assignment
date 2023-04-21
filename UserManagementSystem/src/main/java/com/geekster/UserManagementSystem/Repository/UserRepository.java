
package com.geekster.UserManagementSystem.Repository;

import com.geekster.UserManagementSystem.Model.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public List<User> getAllUsers() {
        return userList;
    }

    public Optional<User> getUserById(int userId) {
        return userList.stream().filter(user -> user.getUserId() == userId).findFirst();
    }

    public void saveUser(User user) {
        userList.add(user);
    }

    public boolean deleteUserById(int userId) {
        return userList.removeIf(user -> user.getUserId() == userId);
    }

    public int getNextUserId() {
        int maxUserId = 0;
        for (User user : userList) {
            if (user.getUserId() > maxUserId) {
                maxUserId = user.getUserId();
            }
        }
        return maxUserId + 1;
    }

    public int getMaxUserId() {
        int maxUserId = 0;
        for (User user : userList) {
            if (user.getUserId() > maxUserId) {
                maxUserId = user.getUserId();
            }
        }
        return maxUserId;
    }
}