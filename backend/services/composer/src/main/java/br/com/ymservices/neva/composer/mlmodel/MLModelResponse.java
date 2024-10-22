package br.com.ymservices.neva.composer.mlmodel;

public record MLModelResponse (
    String id,
    String name,
    String title,
    String description,
    String createModel,
    String trainModel,
    String validateModel,
    String executeModel,
    String scenarioId,
    String scenarioName
) {
    
}
