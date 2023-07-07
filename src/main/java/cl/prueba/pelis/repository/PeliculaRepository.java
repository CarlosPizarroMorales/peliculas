package cl.prueba.pelis.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import cl.prueba.pelis.models.Pelicula;

public interface PeliculaRepository extends CrudRepository<Pelicula, Long>{

	Optional<Pelicula> findById(Long id);
	List<Pelicula> findAll();
}
