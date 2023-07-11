package cl.prueba.pelis.repository;

import org.springframework.data.repository.CrudRepository;

import cl.prueba.pelis.models.Calificacion;

public interface CalificacionesRepository extends CrudRepository<Calificacion, Long>{
    
}
