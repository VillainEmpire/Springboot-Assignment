package com.geekster.UserWithValidation.service;



import com.geekster.UserWithValidation.model.User;
import com.geekster.UserWithValidation.repository.IUserRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserInterface{

    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        user.setDate(new Date());
        user.setTime(new Timestamp(System.currentTimeMillis()));

        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User set(JSONObject user) {
        User newUser = new User();
        newUser.setUser_id(user.getInt("user_id"));
        newUser.setUser_name(user.getString("user_name"));
        newUser.setDate_of_birth(user.getString("date_of_birth"));
        newUser.setEmail(user.getString("email"));
        newUser.setPhone_number(user.getString("phone_number"));
        return newUser;
    }

    public List<User> getUser(Integer id) {
        List<Integer>ids = new ArrayList<>();
        ids.add(id);
        return userRepository.findAllById(ids);
    }

    public List<String> deleteById(Integer id) {

        List<Integer>ids = new ArrayList<>();
        List<String>forChecking = new ArrayList<>();
        ids.add(id);
        List<User>users =  userRepository.findAllById(ids);
        if(users.isEmpty()){
            return forChecking;
        }else{
            userRepository.deleteById(id);
            forChecking.add("User deleted");
            return forChecking;
        }
    }
}