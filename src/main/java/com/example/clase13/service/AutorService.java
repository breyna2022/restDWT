
package com.example.clase13.service;

import com.example.clase13.entity.Autor;
import java.util.List;

/**
 *
 * @author admin
 */
public interface AutorService {
    Autor create(Autor a);
    Autor update(Autor a);
    void delete(Integer id);
    Autor read(Integer id);
    List<Autor> readAll();
}
