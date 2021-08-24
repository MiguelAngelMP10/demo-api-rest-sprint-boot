package com.example.pelicula.controller;

import com.example.pelicula.model.Pelicula;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculasController {

    private Pelicula model;

    public PeliculasController() {
        model = new Pelicula();
    }

    @GetMapping
    public ResponseEntity<String> getAllMovies() {
        return new ResponseEntity<String>("All peliculas!.", HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<String> getMovieById(@PathVariable("id") String id) {
        return new ResponseEntity<String>(id, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> saveMovie(@RequestBody String body) {
        return new ResponseEntity<String>(body, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable("id") long id) {

        return new ResponseEntity<String>("movie deleted successfully!." + id, HttpStatus.OK);
    }

}