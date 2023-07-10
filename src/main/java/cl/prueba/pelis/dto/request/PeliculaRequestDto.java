package cl.prueba.pelis.dto.request;

import java.util.ArrayList;
import java.util.List;

public class PeliculaRequestDto {

	String nombre;
	int anno;
	List<ActorRequestDto> actores = new ArrayList<>();
	
	public PeliculaRequestDto() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}

	public List<ActorRequestDto> getActores() {
		return actores;
	}

	public void setActores(List<ActorRequestDto> actores) {
		this.actores = actores;
	}
	
	public void addActores(List<ActorRequestDto> actor) {
		this.actores.addAll(actor);
	}
}
