package com.example.demo.controladores;

import com.example.demo.modelos.Autor;
import com.example.demo.repository.AutorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    private final AutorRepository repo;

    public AutorController(AutorRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Autor> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Autor guardar(@RequestBody Autor autor) {
        return repo.save(autor);
    }
}
