package com.example.semana2;


public class Peliculas {
    private int id;
    private String titulo;
    private int año;
    private String director;
    private String genero;
    private String descripcion;

    public Peliculas(int id, String titulo, int año, String director, String genero, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getAño() { return año; }
    public String getDirector() { return director; }
    public String getGenero() { return genero; }
    public String getDescripcion() { return descripcion; }

    public void setId(int id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAño(int año) { this.año = año; }
    public void setDirector(String director) { this.director = director; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}

