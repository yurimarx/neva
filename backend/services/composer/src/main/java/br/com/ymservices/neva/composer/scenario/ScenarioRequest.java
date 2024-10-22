package br.com.ymservices.neva.composer.scenario;

public record ScenarioRequest (
    String id,
    String name,
    String title,
    String description,
    String businessUnitId
) {

}
