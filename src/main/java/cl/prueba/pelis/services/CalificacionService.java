package cl.prueba.pelis.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.prueba.pelis.dto.request.CalificacionRequestDto;
import cl.prueba.pelis.dto.response.CalificacionResponseDto;
import cl.prueba.pelis.dto.response.PeliculaResponseDto;
import cl.prueba.pelis.models.Calificacion;
import cl.prueba.pelis.models.Pelicula;
import cl.prueba.pelis.repository.CalificacionesRepository;
import cl.prueba.pelis.repository.PeliculaRepository;

@Service
public class CalificacionService {
    
    @Autowired
    CalificacionesRepository calificacionesRepository;

    @Autowired
    PeliculaRepository peliculaRepository;

    public CalificacionResponseDto create(CalificacionRequestDto dto) throws Exception {
        Optional<Pelicula> optionalPeli = peliculaRepository.findById(dto.getIdPelicula());
        Calificacion calificacion = null;
        if (optionalPeli.isPresent()) {
           calificacion = new Calificacion(dto.getNota(), dto.getComentario(), optionalPeli.get());
           calificacion = calificacionesRepository.save(calificacion);
        } else
            throw new Exception("La pelicula con id " + dto.getIdPelicula() + " no existe");

        return calificacion != null ? map(calificacion) : null;
    }

    CalificacionResponseDto map(Calificacion entity) {
        CalificacionResponseDto dto = new CalificacionResponseDto();
        dto.setNota(entity.getNota());
        dto.setComentario(entity.getComentario());
        dto.setPelicula(new PeliculaResponseDto(entity.getPelicula()));
        return dto;
    }
}
