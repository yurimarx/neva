package br.com.ymservices.neva.composer.datafield;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import br.com.ymservices.neva.composer.crud.CrudMapper;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface DatafieldMapper extends CrudMapper<Datafield, DatafieldRequest, DatafieldResponse> {
    
    @Mapping(source = "datasetId", target = "dataset.id")
    @Mapping(source = "featureId", target = "feature.id")
    Datafield requestToEntity(DatafieldRequest source);

    @Mapping(source = "dataset.id", target = "datasetId")
    @Mapping(source = "dataset.name", target = "datasetName")
    @Mapping(source = "feature.id", target = "featureId")
    @Mapping(source = "feature.name", target = "featureName")
    DatafieldResponse entityToResponse(Datafield source);
}
