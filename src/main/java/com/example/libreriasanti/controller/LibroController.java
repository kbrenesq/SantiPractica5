package com.example.libreriasanti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.libreriasanti.service.LibroService;

@Controller
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("")
    public String getLibros(Model model) {
        model.addAttribute("libros", libroService.getLibros());
        System.out.println(libroService.getLibros());
        return "libros";  // Correct
    }
}
