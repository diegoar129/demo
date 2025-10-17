package com.detodito.demo.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;



@Entity
@Table(name = "categorias")
public class Categoria {

    @ManyToMany(mappedBy = "categorias")
    private List<Producto> productos = new ArrayList<>();



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "serial", nullable = false)
    private String serial;

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}

 

    
    
    


    
