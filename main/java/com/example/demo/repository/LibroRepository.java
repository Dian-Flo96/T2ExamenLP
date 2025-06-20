package com.example.demo.repository;

import com.example.demo.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> { }
