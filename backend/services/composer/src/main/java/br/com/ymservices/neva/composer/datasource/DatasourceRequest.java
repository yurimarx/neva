package br.com.ymservices.neva.composer.datasource;

public record DatasourceRequest (
    String id,
    String name,
    String title,
    String description,
    String businessUnitId
) {

}
