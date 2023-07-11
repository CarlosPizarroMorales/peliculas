package cl.prueba.pelis.dto.request;

public class CalificacionRequestDto {

    private int nota;

    private String comentario;

    private Long idPelicula;

    public CalificacionRequestDto() {
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

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    
    
}
