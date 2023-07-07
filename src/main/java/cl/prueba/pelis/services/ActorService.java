package cl.prueba.pelis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.prueba.pelis.models.Actor;
import cl.prueba.pelis.repository.ActorRepository;

@Service
public class ActorService {

	@Autowired
	private ActorRepository actorRepository;
	
	public List<Actor> actores() {
		return actorRepository.findAll();
	}
	
	public Actor create(Actor a) {
		return actorRepository.save(a);
	}
	
	public Actor finById(Long id) {
		Optional<Actor> actor =actorRepository.findById(id); 
		if(actor.isPresent()) {
			return actor.get();}
		return null;
	}
	
	
	public void eliminarActor(Long id) {
		 actorRepository.deleteById(id);;
	}
	
	
	public Actor modificarActor(Long id, String nombre) {
		Optional<Actor> actorOptional = actorRepository.findById(id);
		if(actorOptional.isPresent()) {
			//actualiza
			Actor actorToUpdate = actorOptional.get();
			actorToUpdate.setNombre(nombre);
			
			return actorToUpdate; 
		} else {
			return null;
		}
	}
}
