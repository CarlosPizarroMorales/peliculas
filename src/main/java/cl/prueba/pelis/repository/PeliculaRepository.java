package cl.prueba.pelis.repository;

import org.springframework.stereotype.Repository;
import cl.prueba.pelis.models.Pelicula;

@Repository
public interface PeliculaRepository extends CommonRepository<Pelicula>{

	Pelicula findByNombre(String nombre);
}
