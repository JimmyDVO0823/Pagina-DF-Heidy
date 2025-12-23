package com.informaticonfig.spring.heidydf.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; // Cambiamos esto


@RestController//Indica que responde con datos, no con vistas
@RequestMapping//(Opcional pero recomendado) Pone un prefijo a todas las rutas.
public class EjemploController {

    @GetMapping("/info")
    public String[] info() {
        String[] data = new String[3];
        data[0] = "info 1";
        data[1] = "info 2";
        data[2] = "info 3";
        // Ahora esto devolverá el texto literal a tu React o al navegador
        return data;
    }
}