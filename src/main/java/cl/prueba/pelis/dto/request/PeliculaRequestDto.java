package cl.prueba.pelis.dto.request;

public class PeliculaRequestDto {

	String nombre;
	int anno;
	
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
	
	
}
