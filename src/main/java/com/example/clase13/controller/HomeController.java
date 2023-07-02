
package com.example.clase13.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author DELL
 */
@RestController
public class HomeController {
    
    @GetMapping("/")
    public String login(){
        return "Bienvenido a Rest";
    }
}
