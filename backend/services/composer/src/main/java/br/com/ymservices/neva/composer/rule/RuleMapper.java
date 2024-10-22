package br.com.ymservices.neva.composer.rule;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import br.com.ymservices.neva.composer.crud.CrudMapper;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RuleMapper extends CrudMapper<Rule, RuleRequest, RuleResponse> {
    
    @Mapping(source = "scenarioId", target = "scenario.id")
    Rule requestToEntity(RuleRequest source);

    @Mapping(source = "scenario.id", target = "scenarioId")
    @Mapping(source = "scenario.name", target = "scenarioName")
    RuleResponse entityToResponse(Rule source);
}
