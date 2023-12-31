package com.libros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.libros.model.Libro;
import com.libros.service.LibroService;


@RestController
public class LibrosController {

    @Autowired
    LibroService service;

    @GetMapping(value="libros", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> libros() {
		return service.libros();
    }

    @PostMapping(value="libro", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void guardar(@RequestBody Libro libro){
        service.altaLibro(libro);
    }

    @PutMapping(value="libro", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@RequestBody Libro Libro){
        service.actualizarLibro(Libro);
    }

    @DeleteMapping(value="libro/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
        public List<Libro> eliminar(@PathVariable("isbn") int isbn){
        return service.eliminarLibro(isbn);
    }

    @GetMapping(value="libro/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
    public Libro buscar(@PathVariable("isbn") int isbn){
        return service.buscarLibro(isbn);
    }
}
