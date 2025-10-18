package com.detodito.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "producto")
public class Producto {
    
    
    
    private Integer id_producto;

    private Integer id_categoria;

    // Getters y Setters
    public Integer getId_producto() {
        return id_producto;
    }  
    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }
    public Integer getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

}
