package com.example.demo.Service;

import com.example.demo.Model.Pelicula;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class PeliculaService {

    List<Pelicula> peliculas = new ArrayList<>();

    // listar por peliculas
    public List<Pelicula> listar(){
        return peliculas;
    }

    // agregar pelicula

    public String agregar(Pelicula pelicula){

        // validacion simple
        if(pelicula.getNombre() == null || pelicula.getNombre().isEmpty()){
            return "el nombre es obligatorio";
        }

        peliculas.add(pelicula);
        return "pelicula agregada correctamente";
    }

    // eliminar pelicula
    public String eliminar(String nombre){
        for (Pelicula p : peliculas){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                peliculas.remove(p);
                return "pelicula elimindada";
            }
        }
        return "pelicula no encontrada";

    }

}

