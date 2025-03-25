package com.example.semana2;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PeliculasController {
    private List<Peliculas> peliculas = new ArrayList<>();

    public PeliculasController() {
        peliculas.add(new Peliculas(1, "Tiburón", 1975, "Steven Spielberg", "Terror", "Un gran tiburón blanco ataca a los bañistas en un pueblo costero."));
        peliculas.add(new Peliculas(2, "Terminator", 1984, "James Cameron", "Ciencia Ficción", "Un cyborg asesino del futuro regresa en el tiempo para matar a Sarah Connor."));
        peliculas.add(new Peliculas(3, "Casablanca", 1942, "Michael Curtiz", "Romance", "Un expatriado se reencuentra con un antiguo amor durante la Segunda Guerra Mundial."));
        peliculas.add(new Peliculas(4, "Psicosis", 1960, "Alfred Hitchcock", "Suspenso", "Una mujer desaparece después de robar dinero y termina en un misterioso motel."));
        peliculas.add(new Peliculas(5, "Ciudadano Kane", 1941, "Orson Welles", "Drama", "La vida y muerte de un magnate de la prensa."));
        peliculas.add(new Peliculas(6, "Lo que el viento se llevó", 1939, "Victor Fleming", "Drama", "Una historia de amor durante la Guerra Civil estadounidense."));
        peliculas.add(new Peliculas(7, "Ben-Hur", 1959, "William Wyler", "Épica", "Un príncipe judío lucha contra el Imperio Romano."));
        peliculas.add(new Peliculas(8, "El Padrino", 1972, "Francis Ford Coppola", "Crimen", "La historia de una familia mafiosa en Nueva York."));
        peliculas.add(new Peliculas(9, "Metrópolis", 1927, "Fritz Lang", "Ciencia Ficción", "Una ciudad futurista dividida entre la clase trabajadora y la élite."));
        peliculas.add(new Peliculas(10, "Cantando bajo la lluvia", 1952, "Gene Kelly", "Musical", "Una comedia sobre la transición del cine mudo al sonoro."));
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
