package br.com.ymservices.neva.composer.businessunit;


public record BusinessUnitRequest (
    String id,
    String name,
    String acronym,
    String description
) {

}
