package com.libros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.libros.repository.LibrosRepository;
import com.libros.model.Libro;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    LibrosRepository repository;

    public List<Libro> libros() {
        return repository.findAll();
    }

    
    public Libro buscarLibro(int isbn) {
        return repository.findById(isbn).orElse(null);
    }

    
    public void altaLibro(Libro libro) {
        repository.save(libro);
    }

    
    public void actualizarLibro(Libro libro) {
        repository.save(libro);
    }

    
    public List<Libro> eliminarLibro(int isbn) {
        repository.deleteById(isbn);
        return repository.findAll();
    }

}
