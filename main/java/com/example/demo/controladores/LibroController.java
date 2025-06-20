package com.example.demo.controladores;

import com.example.demo.modelos.Libro;
import com.example.demo.repository.LibroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroRepository repo;

    public LibroController(LibroRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Libro> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return repo.save(libro);
    }
}
