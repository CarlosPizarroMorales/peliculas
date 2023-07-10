package cl.prueba.pelis.dto.response;

public class PeliculaDeleteResponseDto extends CommonDeleteDto{

	public PeliculaDeleteResponseDto(Long id) {
		super("Pelicula", id);
	}
}
