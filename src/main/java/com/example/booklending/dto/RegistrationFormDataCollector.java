/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.booklending.dto;

import com.example.booklending.utilities.UserCreationParameters;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 *
 * @author Harmony
 */

@Data
public class RegistrationFormDataCollector {
    
    
    @NotNull
    @NotBlank(message="First Name is required")
    private String firstName;
    
    @NotNull
    @NotBlank(message="Last Name is required")
    private String lastName;
    
    @NotNull
    @NotBlank(message="E-Mail is required")
    private String email;
    
    @NotNull
    @NotBlank(message="Password is required")
    private String password;
    
    private String role;
 
    public UserCreationParameters toParameters() {
        return new UserCreationParameters(firstName, lastName,email,password,role);
    }
}
