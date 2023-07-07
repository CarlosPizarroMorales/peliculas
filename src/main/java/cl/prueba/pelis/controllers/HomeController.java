package cl.prueba.pelis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.prueba.pelis.models.Actor;
import cl.prueba.pelis.models.Pelicula;
import cl.prueba.pelis.services.ActorService;
import cl.prueba.pelis.services.PeliculaService;

@RestController()
@RequestMapping("cine")
public class HomeController {

	@Autowired
	private ActorService servicioActor;
	
	@Autowired
	private PeliculaService servicioPelicula;
	
	@GetMapping("/inicio")
	public String getInit() {
		return "hola hola!";
	}

	//Actores CRUD
	
	//Create
	@PostMapping("/actores")
	public Actor createActor(@RequestBody Actor actor) {
		return servicioActor.create(actor);
	}
	
	//Read
	@GetMapping("/actores")
	public List<Actor> getActores() {
		return servicioActor.actores();
	}
	
	//Update
	@PostMapping("/actores/{id}")
	public Actor updateActor(@PathVariable("id") Long id,@RequestBody Actor actor) {
		System.out.println("CUALQUIERCOSA");
		 Actor a = servicioActor.finById(id);
	        if ( a != null ) {
	            return servicioActor.create(actor);
	        }
	        return null;		
		
		//return servicioActor.modificarActor(id);
	}
	
	//Delete
	@DeleteMapping("/actores")
	public void deleteActor(@RequestParam("id") Long id) {
		 servicioActor.eliminarActor(id);
 
	}
	
	
	
	
	//Peliculas CRUD
	//Read
	@GetMapping("/peliculas")
	public List<Pelicula> getPeliculas() {
		return servicioPelicula.peliculas();
	}	
	
}
