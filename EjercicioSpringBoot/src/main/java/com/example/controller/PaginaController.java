package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {
    @GetMapping("/home")
    public String mostrarPagina(Model model){
        model.addAttribute("Titulo","Home");
        model.addAttribute("Descripcion","Hola verdugo");
        model.addAttribute("imageUrl","https://pbs.twimg.com/profile_images/1354006121154023424/khQ3IK-B_400x400.jpg");
        return "PaginaPrincipal.html";
    }
}
