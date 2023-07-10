package cl.prueba.pelis.services;

import org.springframework.stereotype.Service;

import cl.prueba.pelis.dto.request.ActorRequestDto;
import cl.prueba.pelis.dto.response.ActorDeleteResponseDto;
import cl.prueba.pelis.dto.response.ActorResponseDto;
import cl.prueba.pelis.models.Actor;

@Service
public class ActorService extends CommonCrudService<ActorRequestDto, ActorResponseDto, Actor, ActorDeleteResponseDto> {

    @Override
    public ActorResponseDto create(ActorRequestDto input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ActorResponseDto mapEntityToDto(Actor entity) {
        ActorResponseDto dto = new ActorResponseDto();
        dto.setNombre(entity.getNombre());
        return dto;
    }

    @Override
    public ActorDeleteResponseDto mapDelete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Actor mapDtoToEntity(ActorRequestDto input, Actor entity) {
        entity.setNombre(input.getNombre());
        return entity;
    }
    
}
