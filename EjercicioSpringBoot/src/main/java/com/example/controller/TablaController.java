package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TablaController {

    @GetMapping("/tabla")
    public String mostrarPagina(Model model){

        model.addAttribute("columna1","Nombre");
        model.addAttribute("columna2","Apellidos");
        model.addAttribute("columna3","Edad");

        model.addAttribute("fila1","JM");
        model.addAttribute("fila2","Verdugo");
        model.addAttribute("fila3","23");

        return "Tabla.html";

    }


}
