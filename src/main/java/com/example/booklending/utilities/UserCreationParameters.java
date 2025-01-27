/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.booklending.utilities;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Harmony
 */

@AllArgsConstructor
@Data
public class UserCreationParameters {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
}
