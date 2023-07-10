package cl.prueba.pelis.repository;

import org.springframework.data.repository.CrudRepository;
import cl.prueba.pelis.models.CommonEntity;

public interface CommonRepository<E extends CommonEntity> extends CrudRepository<E, Long> {
	
}
