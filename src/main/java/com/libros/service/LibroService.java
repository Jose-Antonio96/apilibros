package com.libros.service;

import java.util.List;

import com.libros.model.Libro;

public interface LibroService {
	List<Libro> libros();
	Libro buscarLibro(int isbn);
	void altaLibro(Libro libro);
	void actualizarLibro(Libro libro);
	List<Libro> eliminarLibro(int isbn);


}
