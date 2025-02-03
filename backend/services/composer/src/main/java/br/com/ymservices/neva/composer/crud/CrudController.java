package br.com.ymservices.neva.composer.crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.AllArgsConstructor;
import java.util.List;

import java.util.stream.Collectors;

@AllArgsConstructor
public abstract class CrudController<T extends CrudEntity,Request, Response> {

    private CrudService<T> service;
    private CrudMapper<T, Request, Response> mapper;

    @GetMapping
    public List<Response> getAll() {
        return service.getAll()
            .stream()
            .map(mapper::entityToResponse)
            .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getById(@PathVariable String id) {
        return service.getById(id)
            .map(entity -> 
                new ResponseEntity<Response>(mapper.entityToResponse(entity), 
                HttpStatus.OK))
            .orElseGet(() -> 
                new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Response> create(@RequestBody Request request) {
        return new ResponseEntity<Response>(
            mapper.entityToResponse(
                service.create(mapper.requestToEntity(request))
            ), 
            HttpStatus.OK
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response> update(
        @PathVariable String id, 
        @RequestBody Request request
    ) {
        return service.getById(id)
                .map(entity -> {
                    return new ResponseEntity<Response>(
                        mapper.entityToResponse(
                            service.update(id, mapper.requestToEntity(request))), 
                            HttpStatus.OK);
                })
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        if (!service.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}