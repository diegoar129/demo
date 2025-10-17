package com.detodito.demo.controller;

import com.detodito.demo.model.Categoria;
import com.detodito.demo.repository.CategoriaRepository;

import jakarta.persistence.Entity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Entity
@RestController
@RequestMapping("/api/categorias")
public class categoria_controller {
    private final CategoriaRepository categoriaRepository;

    public categoria_controller(CategoriaRepository categoriaRepository) {
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