package br.com.ymservices.neva.composer.crud;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public abstract class CrudServiceImpl<T extends CrudEntity> implements CrudService<T> {

    private final JpaRepository<T, String> repository;

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public Optional<T> getById(String id) {
        return repository.findById(id);
    }

    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public T update(String id, T entity) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Resource not found with id: " + id);
        }
        return repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}