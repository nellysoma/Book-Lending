/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.booklending.dto;

import com.example.booklending.entities.Users;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Harmony
 */


public class RegistrationForm {
    
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String role;
    
    public Users toUser(PasswordEncoder passwordEncoder) {
        
        System.out.println("firstname is" + firstname);
        
        return new Users(username, passwordEncoder.encode(password),firstname, lastname,role);
    }
}
