package cl.prueba.pelis.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import cl.prueba.pelis.models.Actor;


public interface ActorRepository extends CrudRepository<Actor, Long>{

}
