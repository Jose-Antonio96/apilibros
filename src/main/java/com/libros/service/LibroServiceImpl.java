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

    @Override
    public List<Libro> libros() {
        return repository.findAll();
    }

    @Override
    public Libro buscarLibro(int isbn) {
        return repository.findById(isbn).orElse(null);
    }

    @Override
    public void altaLibro(Libro libro) {
        repository.save(libro);
    }

    @Override
    public void actualizarLibro(Libro libro) {
        repository.save(libro);
    }

    @Override
    public List<Libro> eliminarLibro(int isbn) {
        repository.deleteById(isbn);
        return repository.findAll();
    }

}
