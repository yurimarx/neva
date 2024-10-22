package br.com.ymservices.neva.composer.scenario;

public record ScenarioResponse (
    String id,
    String name,
    String title,
    String description,
    String businessUnitId,
    String businessUnitName
) {

}
