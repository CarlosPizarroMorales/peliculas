package cl.prueba.pelis.dto.response;

public class PeliculaResponseDto {

	int anno;
	String nombre;
	
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
	
	
}
