/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.clase13.service;

import com.example.clase13.entity.Facultad;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface FacultadService {
    Facultad create(Facultad f);
    Facultad update(Facultad f);
    void delete(int id);
    Facultad read(int id);
    List<Facultad> readAll();
    
}
