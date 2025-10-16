package com.detodito.demo.controller;

import com.detodito.demo.model.productosElectronico;
import com.detodito.demo.repository.productosElectronicoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productosElectronico")
public class prodElect_controller {
    private final productosElectronicoRepository productosElectronicoRepository;

    public prodElect_controller(productosElectronicoRepository productosElectronicoRepository) {
        this.productosElectronicoRepository = productosElectronicoRepository;
    }

    @GetMapping
    public List<productosElectronico> getAllProductosElectronico() {
        return productosElectronicoRepository.findAll();
    }

}
