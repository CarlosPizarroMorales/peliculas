package cl.prueba.pelis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.prueba.pelis.models.CommonEntity;
import cl.prueba.pelis.services.CommonCrudService;

public abstract class CommonCrudController<I, O, D, E extends CommonEntity>{

    @Autowired
    CommonCrudService<I, O, E, D>service;

    @GetMapping("/{id}")
    ResponseEntity<O> getOne(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getOne(id));
    }

    @GetMapping
    ResponseEntity<List<O>> getAll() {
    	return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }

    @PostMapping
    ResponseEntity<O> create(@RequestBody I input) {
    	return ResponseEntity.status(HttpStatus.OK).body(service.create(input));
    }

    @PutMapping("/{id}")
    ResponseEntity<O> update(@RequestBody I input, @PathVariable Long id) {
    	return ResponseEntity.status(HttpStatus.OK).body(service.update(input, id));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<D> delete(@PathVariable Long id) {
    	return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
    }
}