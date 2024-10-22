package br.com.ymservices.neva.composer.datafield;

public record DatafieldRequest (
    String id,
    String name,
    String title,
    String description,
    String script,
    String datasetId,
    String featureId
) {

}
