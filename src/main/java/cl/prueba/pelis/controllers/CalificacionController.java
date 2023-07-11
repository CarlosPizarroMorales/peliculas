package cl.prueba.pelis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.prueba.pelis.dto.request.CalificacionRequestDto;
import cl.prueba.pelis.dto.response.CalificacionResponseDto;
import cl.prueba.pelis.services.CalificacionService;

@RestController
@RequestMapping("/calificacion")
public class CalificacionController {

    @Autowired
    CalificacionService calificacionService;

    @PostMapping
    ResponseEntity<CalificacionResponseDto> create(@RequestBody CalificacionRequestDto dto) throws Exception {
        return ResponseEntity.ok().body(calificacionService.create(dto));
    }
    
}
