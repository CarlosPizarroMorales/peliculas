package cl.prueba.pelis.repository;

import cl.prueba.pelis.models.Pelicula;

public interface PeliculaRepository extends CommonRepository<Pelicula>{

	Pelicula findByNombre(String nombre);
}
