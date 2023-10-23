package com.example.demo.controller;


import com.example.demo.Alumno;
import com.example.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class AlumnoController {
    @Autowired
    private AlumnoRepository i;

    @PostMapping("/addAlumno")
    public String addAlumno(Alumno alumno){
        i.save(alumno);
        return("redirect:/home");
    }

    @GetMapping("/")
    public String listaPersonas(Model model) {
        List<Alumno> alumnos = i.findAll();
        model.addAttribute("alumnos", alumnos);
        return "home";
    }

    @GetMapping("/nuevo")
    public String form(Model model){
        model.addAttribute("alumno", new Alumno());
        return "formulario";
    }


}
