package cl.prueba.pelis.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class Actor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	/*
	 * Importante: mappedBy apunta al atributo en la clase
	 * opuesta que contiene el listado de instancias de esta
	 * misma clase.
	 */
	@ManyToMany(mappedBy = "actores", fetch = FetchType.LAZY)
//	private Set<Pelicula> peliculas = new HashSet<>();
	private List<Pelicula> peliculas = new ArrayList<>();
	
	public Actor() {}

	public Actor(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
	
}
