package br.com.ymservices.neva.composer.scenario;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import br.com.ymservices.neva.composer.crud.CrudMapper;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ScenarioMapper extends CrudMapper<Scenario, ScenarioRequest, ScenarioResponse> {
    
    @Mapping(source = "businessUnitId", target = "businessUnit.id")
    Scenario requestToEntity(ScenarioRequest source);

    @Mapping(source = "businessUnit.id", target = "businessUnitId")
    @Mapping(source = "businessUnit.name", target = "businessUnitName")
    ScenarioResponse entityToResponse(Scenario source);
}
