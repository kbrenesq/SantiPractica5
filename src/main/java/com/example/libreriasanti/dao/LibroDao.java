package com.example.libreriasanti.dao;

import com.example.libreriasanti.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroDao extends JpaRepository<Libro, Long> {
}