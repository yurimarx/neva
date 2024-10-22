package br.com.ymservices.neva.composer.datasource;

public record DatasourceResponse (
    String id,
    String name,
    String title,
    String description,
    String businessUnitId,
    String businessUnitName
) {

}
