/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.clase13.controller;

import com.example.clase13.entity.Autor;
import com.example.clase13.service.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@RequestMapping(value="/autores")
public class AutorController {
    @Autowired
    private AutorService aservice;
    
    @GetMapping("/listar")
    public List<Autor> index(){
        return aservice.readAll();
    }
    @GetMapping("/listar/{id}")
    public ResponseEntity<Autor> autorId(@PathVariable Integer id){
        try {
            Autor autor = aservice.read(id);
            return new ResponseEntity<>(autor, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
    }
    /*
    @PostMapping("/save")
    public String save(@Validated @ModelAttribute Autor autor, BindingResult result, Model model, RedirectAttributes attributes){
        aservice.create(autor);
        return "redirect:/autores/listar";
    }*/
}
