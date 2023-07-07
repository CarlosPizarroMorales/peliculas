package cl.prueba.pelis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.prueba.pelis.models.Pelicula;
import cl.prueba.pelis.repository.PeliculaRepository;

@Service
public class PeliculaService {

	@Autowired
	private PeliculaRepository peliculaRepository;
	
	public List<Pelicula> peliculas(){
	
		return peliculaRepository.findAll();
	}
}
