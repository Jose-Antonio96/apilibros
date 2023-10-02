package com.libros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.libros.model.Libro;

@Repository
public interface LibrosRepository extends JpaRepository<Libro, Integer>{
    
}


