package cl.prueba.pelis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.prueba.pelis.models.Actor;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Long>{

	Optional<Actor> findById(Long id);
	List<Actor> findAll();
	
	Actor save(Actor a);
	
	
	
}
