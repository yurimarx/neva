package br.com.ymservices.neva.composer.feature;

public record FeatureResponse (
    String id,
    String name,
    String title,
    String description,
    String businessEntityId,
    String businessEntityName
) {

}
