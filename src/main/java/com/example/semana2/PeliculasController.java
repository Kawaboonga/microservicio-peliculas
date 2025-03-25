package com.example.semana2;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculasController {
    private List<Peliculas> peliculas = new ArrayList<>();

    public PeliculasController() {
        peliculas.add(new Peliculas(1, "Tiburón", 1975, "Steven Spielberg", "Terror", "Un gran tiburón blanco ataca a los bañistas en un pueblo costero."));
        peliculas.add(new Peliculas(2, "Terminator", 1984, "James Cameron", "Ciencia Ficción", "Un cyborg asesino del futuro regresa en el tiempo para matar a Sarah Connor."));
        peliculas.add(new Peliculas(3, "Gremlins", 1984, "Joe Dante", "Terror / Comedia", "Un joven recibe una extraña criatura como mascota, que desata el caos cuando se multiplican."));
        peliculas.add(new Peliculas(4, "Akira", 1988, "Katsuhiro Otomo", "Animación / Ciencia Ficción", "En un futuro post-apocalíptico, un joven desarrolla poderes psíquicos que amenazan con destruir Neo-Tokyo."));
        peliculas.add(new Peliculas(5, "Dark City", 1998, "Alex Proyas", "Ciencia Ficción / Misterio", "Un hombre sin recuerdos lucha por descubrir la verdad en una ciudad controlada por seres extraños."));
    }

    @GetMapping("/peliculas")
    public List<Peliculas> getPeliculas() {
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Peliculas getPeliculasPorId(@PathVariable int id) {
        for (Peliculas peliculas : peliculas) {
            if (peliculas.getId() == id) {
                return peliculas;
            }
        }
        throw new RuntimeException("Película no encontrada con ID: " + id);
    }
}
