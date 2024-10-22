package br.com.ymservices.neva.composer.feature;

public record FeatureRequest (
    String id,
    String name,
    String title,
    String description,
    String businessEntityId
) {

}
