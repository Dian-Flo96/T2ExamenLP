package com.example.demo.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idlibro;

    private String titulo;
    private Integer anioPublicacion;
    private String editorial;

    @ManyToOne
    @JoinColumn(name = "idautor")
    private Autor autor;

    // Getters y setters
    public Integer getIdlibro() { return idlibro; }
    public void setIdlibro(Integer idlibro) { this.idlibro = idlibro; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Integer getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(Integer anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }
}
