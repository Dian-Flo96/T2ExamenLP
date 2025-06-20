package com.example.demo.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idautor;

    private String nombre;
    private String nacionalidad;

    // Getters y setters
    public Integer getIdautor() { return idautor; }
    public void setIdautor(Integer idautor) { this.idautor = idautor; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
}
