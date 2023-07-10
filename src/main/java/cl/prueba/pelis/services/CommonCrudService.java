package cl.prueba.pelis.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.prueba.pelis.models.CommonEntity;
import cl.prueba.pelis.repository.CommonRepository;

public abstract class CommonCrudService<I, O, E extends CommonEntity, D> {

	@Autowired
    protected CommonRepository<E> repository;
    
	public O getOne(Long id) {
		Optional<E> entity = repository.findById(id);
		return this.map(entity.get());
	}
	
	public List<O> getAll() {
		System.out.println("En el service!!");
		List<O> o = new ArrayList<>();
		
		Optional<Iterable <E>> entities = Optional.of(repository.findAll());
		if(entities.isPresent()) {
			for(E e: entities.get()) {
				o.add(map(e));
			}
		}
		
		return o;
		
	}
	
	public abstract O create(I input);

	public O update(I input, Long id) {
		O o = null;
		Optional<E> e = repository.findById(id);
		if (e.isPresent()) {
			E entity = e.get();
			entity = mapDto(input, entity);
			o = map(repository.save(entity));
			
		}
		return o;
	}

	public D delete(Long id) {
		repository.deleteById(id);
		return this.mapDelete(id);
	}

	public abstract O map(E entity);
	public abstract D mapDelete(Long id);
	public abstract E mapDto(I input, E entity);
}