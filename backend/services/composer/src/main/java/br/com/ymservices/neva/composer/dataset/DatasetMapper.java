package br.com.ymservices.neva.composer.dataset;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import br.com.ymservices.neva.composer.crud.CrudMapper;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface DatasetMapper extends CrudMapper<Dataset, DatasetRequest, DatasetResponse> {
    
    @Mapping(source = "businessUnitId", target = "businessUnit.id")
    @Mapping(source = "datasourceId", target = "datasource.id")
    @Mapping(source = "scenarioId", target = "scenario.id")
    Dataset requestToEntity(DatasetRequest source);

    @Mapping(source = "businessUnit.id", target = "businessUnitId")
    @Mapping(source = "businessUnit.name", target = "businessUnitName")
    @Mapping(source = "datasource.id", target = "datasourceId")
    @Mapping(source = "datasource.name", target = "datasourceName")
    @Mapping(source = "scenario.id", target = "scenarioId")
    @Mapping(source = "scenario.name", target = "scenarioName")
    DatasetResponse entityToResponse(Dataset source);
}
