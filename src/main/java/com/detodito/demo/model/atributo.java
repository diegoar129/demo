package com.detodito.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "atributo")
public class atributo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "serial", nullable = false)
    private String valor;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "color", nullable = false)
    private String color;

    

    // Getters y Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
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

}