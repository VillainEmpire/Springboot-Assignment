package com.geekster.UserWithValidation;

import com.geekster.UserWithValidation.repository.IUserRepository;
import com.geekster.UserWithValidation.service.IUserInterface;
import com.geekster.UserWithValidation.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService(IUserRepository userRepository) {
        return new UserService(userRepository);
    }

}