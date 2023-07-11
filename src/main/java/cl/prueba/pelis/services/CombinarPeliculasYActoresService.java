package cl.prueba.pelis.services;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.prueba.pelis.dto.request.CommonIdRequestDto;
import cl.prueba.pelis.dto.request.PeliculaActorRequestDto;
import cl.prueba.pelis.dto.response.PeliculaResponseDto;
import cl.prueba.pelis.models.Actor;
import cl.prueba.pelis.models.Pelicula;
import cl.prueba.pelis.repository.ActorRepository;
import cl.prueba.pelis.repository.PeliculaRepository;

@Service
public class CombinarPeliculasYActoresService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Autowired
    private ActorRepository actorRepository;

    public PeliculaResponseDto combinarPelis(PeliculaActorRequestDto dto) throws Exception {
        PeliculaResponseDto response = null;
        Optional<Pelicula> pelicula = peliculaRepository.findById(dto.getIdPelicula());

        if (pelicula.isPresent()){
            Pelicula p = pelicula.get();
            for (CommonIdRequestDto id : dto.getIdsActores()) {
                Optional<Actor> optionalActor = actorRepository.findById(id.getId());
                if (optionalActor.isPresent()) {
                    p.addActores(Arrays.asList(optionalActor.get()));
                } else 
                    System.err.println("El actor con id: " + id.getId() + " no existe");
            }
            response =  mapPeliculaConActores(peliculaRepository.save(p));
        } else 
            throw new Exception("la pelicula con id " + dto.getIdPelicula() + "no existe");
        return response;
    }

    PeliculaResponseDto mapPeliculaConActores(Pelicula entity) {
        return new PeliculaResponseDto(entity);
    }
    
}
