
package com.example.clase13.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

import lombok.Data;

/**
 *
 * @author Administrador
 */
@Data
@Entity
@Table(name = "facultad")
public class Facultad implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idfacultad")
    private int id;
    private String nombre;
    private boolean estado;
    
    
}
