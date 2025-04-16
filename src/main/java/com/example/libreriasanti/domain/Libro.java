package com.example.libreriasanti.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Libros")
public class Libro {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String titulo;

    private String autor;

    @Column(name="num_paginas")
    private int numPaginas;

    private String editorial;

    @Column(name="fecha_publicado")
    private LocalDate fechaPublicacion;

    private boolean prestado;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;
}
