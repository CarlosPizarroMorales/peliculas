package cl.prueba.pelis.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cl.prueba.pelis.dto.request.PeliculaRequestDto;

@Entity
@Table(name="pelicula")
public class Pelicula extends CommonEntity{

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long id;
	@Column(unique=true)
	private String nombre;
	private int anno;
	
	@OneToMany(mappedBy = "pelicula", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Calificacion> calificaciones;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "pelicula_actor",
			joinColumns = {
					@JoinColumn(name = "pelicula_id", referencedColumnName = "id", nullable = false, updatable = false)
			},
			inverseJoinColumns = {
					@JoinColumn(name = "actor_id", referencedColumnName = "id", nullable = false, updatable = false)
			}
	)
	private List<Actor> actores;
	
	public Pelicula() {}
	
	public Pelicula(Long id, String nombre, int anno) {
		super(id);
		this.nombre = nombre;
		this.anno = anno;
	}

public Pelicula(PeliculaRequestDto input) {
		this.nombre = input.getNombre();
		this.anno = input.getAnno();
	}

	//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
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

	public List<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}
}
