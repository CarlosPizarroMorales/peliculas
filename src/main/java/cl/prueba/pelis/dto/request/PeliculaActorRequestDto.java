package cl.prueba.pelis.dto.request;

import java.util.ArrayList;
import java.util.List;

public class PeliculaActorRequestDto {

    private Long idPelicula;
    private List<CommonIdRequestDto> idsActores = new ArrayList<>();
    public PeliculaActorRequestDto() {
    }
    public Long getIdPelicula() {
        return idPelicula;
    }
    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }
    public List<CommonIdRequestDto> getIdsActores() {
        return idsActores;
    }
    public void setIdsActores(List<CommonIdRequestDto> idsActores) {
        this.idsActores = idsActores;
    } 

    
    
}
