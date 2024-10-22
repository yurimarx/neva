package br.com.ymservices.neva.composer.dataset;

public record DatasetResponse (
    String id,
    String name,
    String title,
    String description,
    String script,
    String businessUnitId,
    String businessUnitName,
    String datasourceId,
    String datasourceName,
    String scenarioId,
    String scenarioName
) {

}
