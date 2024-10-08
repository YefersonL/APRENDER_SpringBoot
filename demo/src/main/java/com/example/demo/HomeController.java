package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Indica que esta clase es un controlador REST
public class HomeController {

    @GetMapping("/")  // Maneja las solicitudes GET a la raíz ("/")
    public String home() {
        return "¡Bienvenido a tu aplicación Spring Boot!";
    }
}
