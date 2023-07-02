
package com.example.clase13.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author admin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idlibro")
    private int id;
    private String titulo;
    private String edicion;
    private int paginas;
    @ManyToOne
    @JoinColumn(name="idautor")
    private Autor autor;
    
    @ManyToOne
    @JoinColumn(name="ideditorial")
    private Editorial editorial;
}
