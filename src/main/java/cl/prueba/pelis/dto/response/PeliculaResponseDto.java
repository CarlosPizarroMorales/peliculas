package cl.prueba.pelis.dto.response;

import java.util.ArrayList;
import java.util.List;

import cl.prueba.pelis.models.Actor;
import cl.prueba.pelis.models.Pelicula;

public class PeliculaResponseDto {

	int anno;
	String nombre;
	List<ActorResponseDto> actores = new ArrayList<>();
	
	public PeliculaResponseDto() {}

	public PeliculaResponseDto(Pelicula entity) {
		this.anno = entity.getAnno();
		this.nombre = entity.getNombre();
		for(Actor actor : entity.getActores()) {
			this.actores.add(new ActorResponseDto(actor));
		} 
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int i) {
		this.anno = i;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ActorResponseDto> getActores() {
		return actores;
	}

	public void setActores(List<ActorResponseDto> actores) {
		this.actores = actores;
	}
	
	public void add(List<ActorResponseDto> actores) {
		this.actores.addAll(actores);
	}
}
