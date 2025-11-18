package com.mapromet.proyecto.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GerenteController {

    @GetMapping("/gerente/home")
    public String gerenteHome() {
        return "gerente_home"; // Vista principal del gerente
    }
}
