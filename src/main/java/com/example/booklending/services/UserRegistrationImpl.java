/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.example.booklending.services;

import com.example.booklending.entities.Users;
import com.example.booklending.repos.UserRepository;
import com.example.booklending.utilities.UserCreationParameters;
import org.springframework.stereotype.Service;

/**
 *
 * @author Harmony
 */
@Service
public class UserRegistrationImpl implements UserRegistrationService {
    
    private final UserRepository userRepository;

    public UserRegistrationImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users createUser(UserCreationParameters parameters) {
        Users user = new Users(parameters.getFirstName(), parameters.getLastName(),parameters.getEmail(),
                parameters.getPassword(),parameters.getRole());
        return userRepository.save(user);
    }
    
}
