package cl.prueba.pelis.repository;

import org.springframework.data.repository.CrudRepository;

import cl.prueba.pelis.models.Actor;

public interface ActorRepository extends CrudRepository<Actor, Long>{

    public Actor findByNombre(String nombre);

}
