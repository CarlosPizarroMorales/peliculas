package cl.prueba.pelis.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.prueba.pelis.dto.request.ActorRequestDto;
import cl.prueba.pelis.dto.response.ActorDeleteResponseDto;
import cl.prueba.pelis.dto.response.ActorResponseDto;
import cl.prueba.pelis.models.Actor;

@RestController
@RequestMapping("/actor")
public class ActorController extends CommonCrudController<ActorRequestDto, ActorResponseDto, ActorDeleteResponseDto, Actor>{

}
