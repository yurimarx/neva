package br.com.ymservices.neva.composer.crud;

public interface CrudMapper<T extends CrudEntity, Request, Response> {

    T requestToEntity(Request source);
    Response entityToResponse(T source);
}
