package cl.prueba.pelis.dto.response;

import java.util.ArrayList;
import java.util.List;

public class PeliculaResponseDto {

	int anno;
	String nombre;
	List<ActorResponseDto> actores = new ArrayList<>();
	
	public PeliculaResponseDto() {}

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
