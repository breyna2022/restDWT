/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clase13.serviceImpl;

import com.example.clase13.entity.Autor;
import com.example.clase13.repository.AutorRepository;
import com.example.clase13.service.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class AutorServiceImpl implements AutorService{
    @Autowired
    private AutorRepository arepo;

    @Override
    public Autor create(Autor a) {
        return arepo.save(a);
    }

    @Override
    public Autor update(Autor a) {
        return arepo.save(a);
    }

    @Override
    public void delete(Integer id) {
        arepo.deleteById(id);
    }

    @Override
    public Autor read(Integer id) {
        return arepo.findById(id).get();
   }

    @Override
    public List<Autor> readAll() {
        return arepo.findAll();
        
    }
    
}
