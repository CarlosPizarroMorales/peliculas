package cl.prueba.pelis.dto.request;

import java.util.List;

public class ActorPeliculaRequestDto {
    
    private Long idActor;
    private List<CommonIdRequestDto> idPeliculas;
    public ActorPeliculaRequestDto() {
    }
    public Long getIdActor() {
        return idActor;
    }
    public void setIdActor(Long idActor) {
        this.idActor = idActor;
    }
    public List<CommonIdRequestDto> getIdPeliculas() {
        return idPeliculas;
    }
    public void setIdPeliculas(List<CommonIdRequestDto> idPeliculas) {
        this.idPeliculas = idPeliculas;
    }

    
}
