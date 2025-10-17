package com.detodito.demo.controller;

import com.detodito.demo.model.productosElectronico;
import com.detodito.demo.repository.productosElectronicoRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productosElectronico")
public class prodElectcontroller {
    private final productosElectronicoRepository productosElectronicoRepository;

    public prodElectcontroller(productosElectronicoRepository productosElectronicoRepository) {
        this.productosElectronicoRepository = productosElectronicoRepository;
    }

    @GetMapping
    public List<productosElectronico> getAllProductosElectronico() {
        return productosElectronicoRepository.findAll();
    }

    @PostMapping
    public productosElectronico createProductoElectronico(@RequestBody productosElectronico producto) {
        return productosElectronicoRepository.save(producto);
    }

}