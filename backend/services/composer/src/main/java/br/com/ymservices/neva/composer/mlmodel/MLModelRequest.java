package br.com.ymservices.neva.composer.mlmodel;

public record MLModelRequest (
    String id,
    String name,
    String title,
    String description,
    String createModel,
    String trainModel,
    String validateModel,
    String executeModel,
    String scenarioId
) {
    
}
