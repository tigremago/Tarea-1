package com.example.demo.Controller;

import com.example.demo.Model.Pelicula;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/api/v1/peliculas")
@RestController
public class PeliculaController {
    List <Pelicula> peliculas = new ArrayList<>();
    // listar peliculas
    @GetMapping 
    public List<Pelicula> getPeliculas(){
        return peliculas;
    }

    // agregar pelicula
    @PostMapping
    public String addPelicula(@RequestBody Pelicula pelicula){
        peliculas.add(pelicula);
        return "pelicula agregada";
    }

    // eliminar pelicula
    @DeleteMapping("/{nombre}")
    public String DeletePelicula(@PathVariable String nombre){

        for (Pelicula p : peliculas){
            if (p.getNombre().equalsIgnoreCase(nombre)){
                peliculas.remove(p);
                return "pelicula eliminada";
            }
        }
        return "pelicula no encontrada";
    }
}
