package cl.prueba.pelis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.prueba.pelis.models.Actor;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Long>{

    public Actor findByNombre(String nombre);

}
