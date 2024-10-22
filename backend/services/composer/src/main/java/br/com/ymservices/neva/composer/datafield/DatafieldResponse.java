package br.com.ymservices.neva.composer.datafield;

public record DatafieldResponse (
    String id,
    String name,
    String title,
    String description,
    String script,
    String datasetId,
    String datasetName,
    String featureId,
    String featureName
) {

}
