/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.example.booklending.controller;

import com.example.booklending.dto.RegistrationFormDataCollector;
import com.example.booklending.services.UserRegistrationService;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Harmony
 */
@Controller

public class UserRegistrationController {
    
   private final UserRegistrationService userRegistrationService;

    public UserRegistrationController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }
    
    
    @GetMapping("/signup")
    public String showUserRegistrationForm(Model model){
        
        model.addAttribute("formData", new RegistrationFormDataCollector());
        
        return "signup";
    }
    
    
    @PostMapping("/create_user")
    public String createUser(@Valid @ModelAttribute("formData") RegistrationFormDataCollector formData,
                               BindingResult bindingResult,
                               Model model){
        
         if (bindingResult.hasErrors()) {
            return "index";
        }
         
         userRegistrationService.createUser(formData.toParameters());
        
        return "redirect:/signupSuccessful";
    }
    
}
