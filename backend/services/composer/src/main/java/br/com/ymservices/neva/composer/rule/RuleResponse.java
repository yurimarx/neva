package br.com.ymservices.neva.composer.rule;

public record RuleResponse (
    String id,
    String name,
    String title,
    String description,
    String script,
    String scenarioId,
    String scenarioName
) {

}
