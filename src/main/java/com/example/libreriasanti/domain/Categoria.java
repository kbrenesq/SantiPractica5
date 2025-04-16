package com.example.libreriasanti.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long id;

    private String nombre_categoria;
}
