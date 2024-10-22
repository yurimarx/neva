package br.com.ymservices.neva.composer.mlmodel;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import br.com.ymservices.neva.composer.crud.CrudMapper;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface MLModelMapper extends CrudMapper<MLModel, MLModelRequest, MLModelResponse> {
    
    @Mapping(source = "scenarioId", target = "scenario.id")
    MLModel requestToEntity(MLModelRequest source);

    @Mapping(source = "scenario.id", target = "scenarioId")
    @Mapping(source = "scenario.name", target = "scenarioName")
    MLModelResponse entityToResponse(MLModel source);
}