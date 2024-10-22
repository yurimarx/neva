package br.com.ymservices.neva.composer.crud;

import java.util.Optional;
import java.util.List;

public interface CrudService<T extends CrudEntity> {

    List<T> getAll();
    Optional<T> getById(String id);
    boolean existsById(String id);
    T create(T entity);
    T update(String id, T entity);
    void delete(String id);
}