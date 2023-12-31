package com.example.controller;


import com.example.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class AlumnoController {
    @Autowired
    private AlumnoRepository i;

    @PostMapping("/nuevo")
    public String addAlumno(Alumno alumno){
        i.save(alumno);
        return("redirect:/Inicio");
    }

    @GetMapping("/Inicio")
    public String listaPersonas(Model model,@PageableDefault(size=5) Pageable pageable) {
        Page<Alumno> alumnos = i.findAll(pageable);
        model.addAttribute("alumnos", alumnos);
        return "Tabla";
    }


    @GetMapping("/nuevo")
    public String form(Model model){
        model.addAttribute("alumno", new Alumno());
        return "Formulario";
    }


}
