package cl.prueba.pelis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.prueba.pelis.dto.request.PeliculaActorRequestDto;
import cl.prueba.pelis.dto.response.PeliculaResponseDto;
import cl.prueba.pelis.services.CombinarPeliculasYActoresService;

@RestController
@RequestMapping("/combinar")
public class CombineActorsAndMoviesController {

    @Autowired
    CombinarPeliculasYActoresService combinarPeliculasYActores;
    
    @PostMapping("/pelicula")
    ResponseEntity<PeliculaResponseDto> combineMovieWithActors(@RequestBody PeliculaActorRequestDto body) throws Exception {

        return ResponseEntity.ok().body(combinarPeliculasYActores.combinarPelis(body));
    }
}
