/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.booklending.services;

import com.example.booklending.entities.Users;
import com.example.booklending.utilities.UserCreationParameters;

/**
 *
 * @author Harmony
 */
public interface UserRegistrationService {
    
    Users createUser(UserCreationParameters parameters);
}
