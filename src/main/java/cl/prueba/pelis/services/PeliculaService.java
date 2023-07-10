package cl.prueba.pelis.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.prueba.pelis.dto.request.PeliculaRequestDto;
import cl.prueba.pelis.dto.response.PeliculaDeleteResponseDto;
import cl.prueba.pelis.dto.response.PeliculaResponseDto;
import cl.prueba.pelis.models.Actor;
import cl.prueba.pelis.models.Pelicula;
import cl.prueba.pelis.repository.ActorRepository;

@Service
public class PeliculaService extends CommonCrudService<PeliculaRequestDto, PeliculaResponseDto, Pelicula, PeliculaDeleteResponseDto> {

	@Autowired
	ActorService actorService;

	@Autowired
	ActorRepository actorRepository;

	@Override
	public PeliculaResponseDto mapEntityToDto(Pelicula entity) {
		PeliculaResponseDto dto = new PeliculaResponseDto();
		dto.setAnno(entity.getAnno());
		dto.setNombre(entity.getNombre());
		dto.add(entity.getActores().stream().map(e -> actorService.mapEntityToDto(e)).collect(Collectors.toList()));
		return dto;
	}

	@Override
	public PeliculaDeleteResponseDto mapDelete(Long id) {
		PeliculaDeleteResponseDto dto = new PeliculaDeleteResponseDto(id);
		return dto;
	}

	@Override
	public PeliculaResponseDto create(PeliculaRequestDto input) {
		List<Actor> actores = new ArrayList<>();
		input.getActores().stream().forEach(a -> {
			Actor actorEntity = actorRepository.findByNombre(a.getNombre());
			if (actorEntity != null) {
				actores.add(actorEntity);
			} else {
				actores.add(actorService.mapDtoToEntity(a, new Actor()));
			}
		});

		Pelicula p = new Pelicula(input, actores);
		p = repository.save(p);
		return mapEntityToDto(p);
	}

	@Override
	public Pelicula mapDtoToEntity(PeliculaRequestDto input, Pelicula entity) {
		entity.setAnno( (input.getAnno() != 0 ? input.getAnno() : entity.getAnno()) );
		entity.setNombre( (input.getNombre() != null ? input.getNombre() : entity.getNombre()) );
		return entity;
	}

}
