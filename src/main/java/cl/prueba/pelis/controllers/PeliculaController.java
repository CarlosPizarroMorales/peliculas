package cl.prueba.pelis.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import cl.prueba.pelis.dto.request.PeliculaRequestDto;
import cl.prueba.pelis.dto.response.PeliculaDeleteResponseDto;
import cl.prueba.pelis.dto.response.PeliculaResponseDto;
import cl.prueba.pelis.models.Pelicula;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController extends CommonCrudController<PeliculaRequestDto, PeliculaResponseDto, PeliculaDeleteResponseDto, Pelicula> {

	
}
