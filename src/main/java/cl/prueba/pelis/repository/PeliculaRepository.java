package cl.prueba.pelis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.prueba.pelis.models.Pelicula;
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long>{

	Optional<Pelicula> findById(Long id);
	List<Pelicula> findAll();
}
