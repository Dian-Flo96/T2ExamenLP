package com.example.demo.repository;

import com.example.demo.modelos.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> { }
