package cl.prueba.pelis.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class Actor extends CommonEntity{

	private String nombre;
	
	/*
	 * Importante: mappedBy apunta al atributo en la clase
	 * opuesta que contiene el listado de instancias de esta
	 * misma clase.
	 */
	@ManyToMany(mappedBy = "actores", fetch = FetchType.LAZY)
	private List<Pelicula> peliculas = new ArrayList<>();
	
	public Actor() {}

	public Actor(Long id, String nombre) {
		super(id);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
}
