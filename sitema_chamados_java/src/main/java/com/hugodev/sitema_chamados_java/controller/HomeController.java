package com.meuapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // Rota da página inicial
    public String home(Model model) {
        model.addAttribute("mensagem", "Bem-vindo ao Spring Boot!");
        return "index"; // Retorna o arquivo index.html em /resources/templates/
    }
}
