package com.example.libreriasanti.dao;

import com.example.libreriasanti.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
}
