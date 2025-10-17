package com.detodito.demo.controller;

import com.detodito.demo.model.Categoria;
import com.detodito.demo.repository.CategoriaRepository;




import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class categoriacontroller {
    private final CategoriaRepository categoriaRepository;

    public categoriacontroller(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    @PostMapping
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

}