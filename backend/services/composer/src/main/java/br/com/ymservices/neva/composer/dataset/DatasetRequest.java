package br.com.ymservices.neva.composer.dataset;


public record DatasetRequest (
    String id,
    String name,
    String title,
    String description,
    String script,
    String businessUnitId,
    String datasourceId,
    String scenarioId
) {

}
