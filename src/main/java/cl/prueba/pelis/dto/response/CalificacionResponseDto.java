package cl.prueba.pelis.dto.response;

public class CalificacionResponseDto {
    
    private int nota;
    private String comentario;
    private PeliculaResponseDto pelicula;
    
    public CalificacionResponseDto() {
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public PeliculaResponseDto getPelicula() {
        return pelicula;
    }

    public void setPelicula(PeliculaResponseDto pelicula) {
        this.pelicula = pelicula;
    }

    
    
}
