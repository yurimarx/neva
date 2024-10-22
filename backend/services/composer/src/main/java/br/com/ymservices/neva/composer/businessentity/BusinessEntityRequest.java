package br.com.ymservices.neva.composer.businessentity;

public record BusinessEntityRequest (
    String id,
    String name,
    String title,
    String description,
    String script,
    String businessUnitId
) {

}
