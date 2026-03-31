package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pelicula {
    private String nombre;
    private String director;
    private int duracion;
    private String genero;
}
