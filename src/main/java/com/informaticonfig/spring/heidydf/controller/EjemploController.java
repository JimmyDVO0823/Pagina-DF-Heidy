package com.informaticonfig.spring.heidydf.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController//Indica que responde con datos, no con vistas
@RequestMapping("/api")//(Opcional pero recomendado) Pone un prefijo a todas las rutas.
public class EjemploController {

    /**
     * @return Objeto a retornar, spring lo convierte automaticamente a JSon
     */
    @GetMapping("/info")
    public Map<String, String> info() {
        //Creamos el objeto que vamos a pasar con el metodo
        Map<String,String> map = new HashMap<>();
        map.put("Title", "Example Controller");
        map.put("Server", "This is my server");
        map.put("ip", "192.157.1.1");
        return map; //Pasamos el objeto (spring lo convierte automaticamente a JSon)
    }

    @PostMapping("/info2")
    public String info2(@RequestBody String body) {
        return body;
    }
}