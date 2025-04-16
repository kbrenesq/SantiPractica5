package com.example.libreriasanti.service.impl;

import com.example.libreriasanti.dao.LibroDao;
import com.example.libreriasanti.domain.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.libreriasanti.service.LibroService;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroDao libroDao;

    @Override
    public List<Libro> getLibros() {
        return libroDao.findAll();
    }
}
