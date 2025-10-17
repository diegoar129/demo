package com.detodito.demo.model;



import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "producto_categoria")
public class producto_categoria {

    private Integer id_producto;
    private Integer id_categoria;

    // Getters and Setters
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
