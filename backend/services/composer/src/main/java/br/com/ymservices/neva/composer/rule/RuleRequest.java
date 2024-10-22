package br.com.ymservices.neva.composer.rule;

public record RuleRequest (
    String id,
    String name,
    String title,
    String description,
    String script,
    String scenarioId
) {

}
