package cl.prueba.pelis.services;

import org.springframework.stereotype.Service;

import cl.prueba.pelis.dto.request.PeliculaRequestDto;
import cl.prueba.pelis.dto.response.PeliculaDeleteResponseDto;
import cl.prueba.pelis.dto.response.PeliculaResponseDto;
import cl.prueba.pelis.models.Pelicula;

@Service
public class PeliculaService extends CommonCrudService<PeliculaRequestDto, PeliculaResponseDto, Pelicula, PeliculaDeleteResponseDto>{

	@Override
	public PeliculaResponseDto map(Pelicula entity) {
		PeliculaResponseDto dto = new PeliculaResponseDto();
		dto.setAnno(entity.getAnno());
		dto.setNombre(entity.getNombre());
		return dto;
	}

	@Override
	public PeliculaDeleteResponseDto mapDelete(Long id) {
		PeliculaDeleteResponseDto dto = new PeliculaDeleteResponseDto(id);
		return dto;
	}

	@Override
	public PeliculaResponseDto create(PeliculaRequestDto input) {
		Pelicula p = new Pelicula(input);
		p = repository.save(p);
		return map(p);
	}

	@Override
	public Pelicula mapDto(PeliculaRequestDto input, Pelicula entity) {
		entity.setAnno(input.getAnno());
		entity.setNombre(input.getNombre());
		return entity;
	}

}
