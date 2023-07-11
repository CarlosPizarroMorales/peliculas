package cl.prueba.pelis.dto.response;

import cl.prueba.pelis.models.Actor;

public class ActorResponseDto {

    String nombre;

    public ActorResponseDto() {
    }

    public ActorResponseDto(Actor actor) {
        this.nombre = actor.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
